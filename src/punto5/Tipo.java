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
public class Tipo extends Objetodedominio{
    private String nombre;
    private double costounidad;

    public Tipo (String nombre, double costounidad, String id){
    super(id);
    this.costounidad=costounidad;
    this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCostounidad() {
        return costounidad;
    }

    public void setCostounidad(double costounidad) {
        this.costounidad = costounidad;
    }

    @Override
    public String toString() {
        return "Item{" + "nombre=" + nombre + ", costounidad=" + costounidad + '}';
    }
    
}
