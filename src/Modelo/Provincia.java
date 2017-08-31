/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author fermatmir
 */
public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades = new ArrayList<>();
            

    public Provincia(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarCiudad(Ciudad c){
        this.ciudades.add(c);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public String toString() {
        return "Provincia{" + "nombre=" + nombre + ", ciudades=" + ciudades + '}';
    }
    
    
}
