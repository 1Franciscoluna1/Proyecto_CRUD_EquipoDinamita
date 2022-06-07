/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author pacol
 */
public class Venta {
    private int num_tkt;
    private boolean status = false;
    private String nombre;
    private String telefono;
    private String cp;
    private String correo;
    private String direccion;
    private String estado;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    private String metodo_pago;

    public int getNum_tkt() {
        return num_tkt;
    }

    public void setNum_tkt(int num_tkt) {
        this.num_tkt = num_tkt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }
    
    public String mostrar_datos(){
        String validacion=null;
            validacion =    "Nombre:\t"+getNombre()+"\n"+
                            "Telefono:\t"+getTelefono()+"\n"+
                            "Correo:\t"+getCorreo()+"\n"+
                            "CP:\t\t"+getCp()+"\n"+
                            "Direccion:\t"+getDireccion()+
                            "\nMetodo de pago:\t"+this.getMetodo_pago();
            return validacion;
    }
}
