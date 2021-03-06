/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;


import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import logica.Venta;
import basedatos.bd;

public class carrito extends javax.swing.JFrame {

    /**
     * Creates new form carrito
     */
    bd bd = null;
    private int tkt;
    ventana_principal objvtnprin = null;
    
    public carrito(ventana_principal obj,DefaultTableModel model_tkt,double total,int ticket){//inicia el constructor
        this.objvtnprin = obj;
        bd = new bd();
        initComponents();
        //iniciamos la tabla con el modelo del ticket pasado por referencia con los datos de la compra
        jTable1.setModel(model_tkt);            
        //colocamos el valor del total en la etiqueta el cual fue tambien pasado por referencia
        lbltotal.setText("Total a pagar: $"+total);
        tkt = ticket;
    }
    
    public carrito() {
        initComponents();
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gpoRB = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tarjeta = new javax.swing.JRadioButton();
        efectivo = new javax.swing.JRadioButton();
        oxxo = new javax.swing.JRadioButton();
        eleven = new javax.swing.JRadioButton();
        confirmarc = new javax.swing.JButton();
        cancelarc = new javax.swing.JButton();
        lbltotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 0));
        jLabel1.setText("QUE SABOR.");

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jLabel2.setText("DATOS PERSONALES");

        jLabel3.setText("Nombre completo");

        jLabel4.setText("Correo electronico");

        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono");

        jLabel6.setText("Direccion");

        jLabel7.setText("Codigo postal");

        jLabel8.setText("Estado");

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Zacatecas", "Ciudad de Mexico", "Jalisco", "Monterrey" }));
        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N
        jLabel9.setText("COMPRA");

        jLabel10.setText("Metodo de pago");

        gpoRB.add(tarjeta);
        tarjeta.setText("Tarjeta de credito/debito");
        tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaActionPerformed(evt);
            }
        });

        gpoRB.add(efectivo);
        efectivo.setText("Efectivo");

        gpoRB.add(oxxo);
        oxxo.setText("Oxxo");

        gpoRB.add(eleven);
        eleven.setText("7-eleven");

        confirmarc.setBackground(new java.awt.Color(153, 153, 0));
        confirmarc.setForeground(new java.awt.Color(255, 255, 255));
        confirmarc.setText("Confirmar");
        confirmarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarcActionPerformed(evt);
            }
        });

        cancelarc.setBackground(new java.awt.Color(153, 153, 0));
        cancelarc.setForeground(new java.awt.Color(255, 255, 255));
        cancelarc.setText("Cancelar");
        cancelarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarcActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefono, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(correo)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oxxo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eleven, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tarjeta))
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(40, 248, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelarc)
                            .addComponent(confirmarc))
                        .addGap(89, 89, 89))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tarjeta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(efectivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oxxo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eleven)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(confirmarc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelarc))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoActionPerformed

    private void tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarjetaActionPerformed

    private void confirmarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarcActionPerformed
        int opc=8;
        Venta venta = new Venta();
        String mtdo_pgo=null;
        //validamos el metodo de pago seleccionado en el grupo de radio buttons
                if(tarjeta.isSelected()){
                    mtdo_pgo="Tarjeta";
                }else if(efectivo.isSelected()){
                    mtdo_pgo="Efectivo";
                }else if(oxxo.isSelected()){
                    mtdo_pgo="Oxxo";
                }else if(eleven.isSelected()){
                    mtdo_pgo="7 Eleven";
                }
        //validamos los datos ingresados dentro de los textfields
        if(nombre.getText().length()<10){
            JOptionPane.showMessageDialog(this,"Nombre erroneo");}
        else if(telefono.getText().length()<10){
            JOptionPane.showMessageDialog(this,"Telefono erroneo");
            }
        else if(correo.getText().length()<9){
            JOptionPane.showMessageDialog(this,"Correo erroneo");
            }
        else if(cp.getText().length()<3){
            JOptionPane.showMessageDialog(this, "Codigo Postal erroneo");
            }
        else if(direccion.getText().length()<5){
            JOptionPane.showMessageDialog(this,"Direccion erroneo");
            }
        else if(estado.getSelectedItem().toString()=="-"){
            JOptionPane.showMessageDialog(this,"Selecciona un estado valido");
            }
        else if(mtdo_pgo==null){
            JOptionPane.showMessageDialog(this,"Selecciona un metodo de pago");
        }
        else{
            //si todos los datos estan bien llenados guardara dentro del objeto venta los datos escritos dentro de los textfields
            venta.setNum_tkt(tkt);
            venta.setNombre(nombre.getText());
            venta.setTelefono(telefono.getText());
            venta.setCorreo(correo.getText());
            venta.setCp(cp.getText());
            venta.setDireccion(direccion.getText());
            venta.setMetodo_pago(mtdo_pgo);
            venta.setEstado("Jalisco");
            venta.setStatus(true);
            //guardamos en un string todo lo guardado dentro del objeto venta
            String validacion=venta.mostrar_datos();
            //muestra una ventana de confirmacion donde pide al usuario validar sus datos, si estan bien lo ssubira a la base de datos
            //si no estan bien, regresara a la ventana para que haga la correccion de los datos
            opc = JOptionPane.showConfirmDialog(this, "??Sus datos estan bien?\n\n"+validacion, "Valide sus datos",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        }
            if (opc == 0){
            //Osea que preciono que los datos estan bien
                bd.abrir_conexion();
                bd.insertar_vta(venta);
                bd.cerrar_conexion();
                objvtnprin.ID_Compra++;
                objvtnprin.setVisible(true);
                this.dispose();
                objvtnprin.ver_pedido();
                this.limpiar_cajas();
            }
        
        
        
    }//GEN-LAST:event_confirmarcActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        objvtnprin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void cancelarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarcActionPerformed
        objvtnprin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarcActionPerformed

    private void limpiar_cajas(){
        correo.setText("");
        cp.setText("");
        direccion.setText("");
        nombre.setText("");
        telefono.setText("");
        estado.setSelectedIndex(0);
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarc;
    private javax.swing.JButton confirmarc;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField cp;
    private javax.swing.JTextField direccion;
    private javax.swing.JRadioButton efectivo;
    private javax.swing.JRadioButton eleven;
    private javax.swing.JComboBox<String> estado;
    private javax.swing.ButtonGroup gpoRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTextField nombre;
    private javax.swing.JRadioButton oxxo;
    private javax.swing.JRadioButton tarjeta;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
