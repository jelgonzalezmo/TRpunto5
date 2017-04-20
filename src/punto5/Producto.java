/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;

import java.util.ArrayList;

/**
 *
 * @author jeisson
 */
public class Producto extends Objetodedominio {

    private String nombre;
    private String descripcion;
    private ArrayList<Tipo> item;

    public Producto(String nombre,String descripcion,String id) {
        super(id);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.item = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Tipo> getItem() {
        return item;
    }

    public void setItems(ArrayList<Tipo> item) {
        this.item = item;
    }

    @Override
    public String toString() {
                return "Producto{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", item=" + item + '}';
    }

}
