/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatos;
import logica.Articulo;
import logica.Venta;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pacol
 */
public class bd {
    Connection conexion;  //se crea el objeto de conexion
    //se crean los statement que seran utilizados para las distintas consultas
    PreparedStatement insertArt, ultimo_id, cant_art, cons_art, total, cons_tkt, cons_rep, upd_cant,ins_vta, ver_status;
    //se crea el objeto del modelo de la tabla con el que vamos a trabajar
    DefaultTableModel modeloTicket = new DefaultTableModel();
    
    
    public bd(){    //iniciamos en constructor
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");      //validamos que el driver este cargado correctamente
        }catch(ClassNotFoundException ex){
            System.out.println("Error al cargar el controlador de MySQL");
        }  
        crear_modelo_Ticket();      //creamos el modelo de la tabla aunque este vacia
    }
    
           public void abrir_conexion(){        //cuando abrimos conexion
        try{
        conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/francisco?serverTimezone=GMT-5","root","");      
        insertArt = conexion.prepareStatement("INSERT INTO compras VALUES (?, ?, ?, ?, ?, ?)");
        ultimo_id = conexion.prepareStatement("SELECT MAX(numticket) FROM compras");
        cant_art = conexion.prepareStatement("SELECT COUNT(*) FROM `compras` WHERE numticket=?");
        cons_art = conexion.prepareStatement("SELECT * FROM `articulos` WHERE clave=?");
        cons_tkt = conexion.prepareStatement("Select * FROM compras WHERE numticket=?");
        total = conexion.prepareStatement("SELECT SUM(sub_total) FROM compras WHERE numticket = ?");
        cons_rep = conexion.prepareStatement("SELECT * FROM compras WHERE cod_art=? AND numticket=?");
        upd_cant = conexion.prepareStatement("UPDATE compras SET cantidad = ?, sub_total = ? WHERE cod_art = ?");
        ins_vta = conexion.prepareStatement("INSERT INTO ventas values (?, ?, ?, ?, ?, ?, ?, ?, ?)");
        ver_status = conexion.prepareStatement("SELECT status FROM ventas WHERE numticket = ?");
        }catch(SQLException ex){
            System.out.println("Error al abrir la conexion de la BD");
        }
        
    }
        
            public void cerrar_conexion(){
        try{
            conexion.close();           //cerramos la conexion con la base de datos por prtocolo de seguridad
        }catch(SQLException ex){
            System.out.println("Error al cerrar la conexion de la BD");
        }
    }
            
            public void instertar_art(Articulo art,int clve_art){
                   ResultSet rs = null;      
                try{
                    //mandamos a consulta dentro de la base de datos con las referencias de nuestra clave de art y numero de ticket
                    cons_rep.setInt(1, clve_art);   
                    cons_rep.setInt(2, art.getId());
                    rs = cons_rep.executeQuery();   //guardamos dentro de nuesto result set lo que nos regresa el query
                    
                    if(!rs.next()){     //si 
                    insertArt.setInt(1,art.getId());
                    insertArt.setString(2, art.getNombre());
                    insertArt.setInt(3, art.getCantidad());
                    insertArt.setDouble(4, art.getPrecio());
                    insertArt.setDouble(5, art.getSubtotal());
                    insertArt.setInt(6, clve_art);
                    insertArt.executeUpdate();
                    }else{
                    art.setCantidad(rs.getInt("cantidad")+art.getCantidad());
                    art.setSubtotal();
                    upd_cant.setInt(1, art.getCantidad());
                    upd_cant.setDouble(2, art.getSubtotal());
                    upd_cant.setInt(3, clve_art);
                    upd_cant.executeUpdate();
                    }
                    
                    }catch(SQLException ex){
                        System.out.println("Error al insertar un articulo en la BD");
                        System.out.println(ex.getMessage());
                }
            }
            
            public int obtener_ID(){
                ResultSet id = null;
                  try{
                    id = ultimo_id.executeQuery();
                  //insertArt.setInt(1, id.getInt("MAX(numticket)"));
                  //id.getInt("MAX(numticket)");
                  if (id.next()){
                    //  ID = id.getInt("MAX(numticket)");
                      System.out.println("El id es "+id.getInt("MAX(numticket)"));
                      return id.getInt("MAX(numticket)");
                  }
                  }catch(SQLException ex){
                        System.out.println("Error al consultar el MAX");
                        System.out.println(ex.getMessage());
                    }
        return -1;
            }
            
            public int obtener_cant(int ticket){
                ResultSet cont = null;
                  try{
                      cant_art.setInt(1, ticket);
                    cont = ultimo_id.executeQuery();
                  //insertArt.setInt(1, id.getInt("MAX(numticket)"));
                  //id.getInt("MAX(numticket)");
                  if (cont.next()){
                    //  ID = id.getInt("MAX(numticket)");
                      System.out.println("El se cuenta con "+cont.getInt("COUNT(*)"));
                      return cont.getInt("COUNT(*)");
                  }
                  }catch(SQLException ex){
                        System.out.println("Error al consultar el MAX");
                        System.out.println(ex.getMessage());
                    }
                
                return-1;
            }
            
            public void crear_modelo_Ticket(){
                modeloTicket.addColumn("Cant");
                modeloTicket.addColumn("Descripcion");
                modeloTicket.addColumn("Precio");
                modeloTicket.addColumn("Importe");
    }


            public DefaultTableModel consultar_Ticket(int ticket){
                ResultSet rs = null;        //seteamos nuestro result set en null
                try{
                    cons_tkt.setInt(1, ticket);     //seteamos dentro de nuestro statement el numero de ticket
                    rs = cons_tkt.executeQuery();       //dentro de rs se almacenara el result set al ejecutar el query
                    if(rs.next()){
                        cargar_datos_modelo(rs);        //funcion para cargar el modelo en base a el rs
                    } else {
                        modeloTicket.setRowCount(0);} //si la consulta fue vacia o no encuentra nada, setea las filas en 0 dentro del modelo
                }catch(SQLException ex){
                    System.out.println("Error al consultar el ticket");
                    System.out.println(ex.getMessage());
                }
                return modeloTicket;                //regresamos el modelo que ubtuvimos en base a nuestro result set
            }

            private void cargar_datos_modelo(ResultSet rs){		
            borrar_modelo();        //se borra el modelo y deja en blanco todo
            try
            {
//		 Bucle para cada resultado en la consulta
                do 
                {
                   // Se crea un array que será una de las filas de la tabla.
                   Object [] fila = new Object[4]; // Hay nueve columnas en la tabla
                      fila[0] = rs.getObject(3);//se asigna cada valor de nuestro result set a cada objeto correspondiente a su columna
                      fila[1] = rs.getObject(2);
                      fila[2] = rs.getObject(4);
                      fila[3] = rs.getObject(5);
                   // System.out.println(fila[i]);
                   // Se añade al modelo la fila completa.
                   modeloTicket.addRow(fila);
                }while (rs.next());
            }catch(SQLException obj){}

    }

            public void borrar_modelo(){
            while(modeloTicket.getRowCount() >= 1){ //ciclo para borrar las filas hasta que el contador de filas sea menor a 1
                    modeloTicket.removeRow(modeloTicket.getRowCount()-1); //elimina la fila 
            }
    }

            public double obtener_total(int ticket){
                double tot=0;
                ResultSet rs = null;
                try{
                    total.setInt(1, ticket);
                    rs = total.executeQuery();
                    if(rs.next())
                        tot = rs.getDouble(1);
                }catch(SQLException ex){
                }

                return tot;
            }

            public Articulo set_art(int clave){
                Articulo arti = new Articulo();
                ResultSet rs = null;
                
                try{
                    cons_art.setInt(1, clave);
                    rs = cons_art.executeQuery();
                    
                    if(rs.next()){
                       arti.setNombre(rs.getString("descripcion"));
                       arti.setPrecio(rs.getDouble("precio"));
                    }
                }catch(SQLException ex){
                        System.out.println("Error al consultar el articulo");
                        System.out.println(ex.getMessage());
                }
                return arti;
            }
            
            public void insertar_vta(Venta vta){
                try{
                ins_vta.setInt(1,vta.getNum_tkt());
                ins_vta.setBoolean(2, vta.isStatus());
                ins_vta.setString(3, vta.getNombre());
                ins_vta.setString(4, vta.getTelefono());
                ins_vta.setString(5, vta.getCp());
                ins_vta.setString(6,vta.getCorreo());
                ins_vta.setString(7, vta.getDireccion());
                ins_vta.setString(8,vta.getEstado());
                ins_vta.setString(9,vta.getMetodo_pago());
                
                ins_vta.executeUpdate();
                }catch(SQLException ex){
                        System.out.println("Error al insertar una venta");
                        System.out.println(ex.getMessage());
                }
            }
            
}
