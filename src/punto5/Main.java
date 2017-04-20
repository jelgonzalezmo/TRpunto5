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
import java.util.ArrayList;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Categoria c1= new Categoria("jabones","suave","101");
       Producto p1=new Producto("jabon","grande","101.1");
       Producto p2=new Producto("jabon2","pequeño","101.2");
       Tipo t1= new Tipo ("bonito",2113,"2345");
       ArrayList<Tipo> tipos=new ArrayList<>();
       tipos.add(t1);
       ArrayList<Producto> productos=new ArrayList<>();
       productos.add(p1);
       productos.add(p2);
       p1.setItems(tipos);
       p2.setItems(tipos);
       c1.setProductos(productos);
       c1.listar();
       
       
       
    
}}
