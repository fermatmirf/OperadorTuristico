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
}
