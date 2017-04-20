/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;

/**
 *
 * @author jeisson
 */
public class Cliente extends Objetodedominio{

    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion1;
    private String direccion2;
    private String ciudad;
    private String estado;
    private String codigopostal;
    private String pais;

    public Cliente(String nombre, String apellido, String telefono, String direccion1, String direccion2, String ciudad, String estado, String codigopostal, String pais, String id) {
        super(id);
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigopostal = codigopostal;
        this.pais = pais;
    }

    
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
                            
}
