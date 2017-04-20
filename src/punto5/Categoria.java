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
public class Categoria extends Objetodedominio {

    private String nombre;
    private String descripcion;
    private ArrayList<Producto> productos;

    public Categoria(String nombre, String descripcion, String id) {
        super(id);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.productos=new ArrayList<>();
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

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

   public void listar(){
       
           System.out.println(this.getNombre()+" "+this.getDescripcion()+" " +this.id+" "+this.productos.toString());
       
              
         }
    }
