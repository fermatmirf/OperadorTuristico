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
public class Pais {
    private String nombre;
    private ArrayList<Provincia> provincias = new ArrayList<Provincia>();
    private ArrayList<PasoFronterizo> pasosFronterizo = new ArrayList<PasoFronterizo>();
    
    public Pais(String nombre) {
        this.nombre = nombre;
    }
    public void agregarProvincia(Provincia p){
        provincias.add(p); 
    }
    public void agregarPasoFronteriso(PasoFronterizo paso){
    this.pasosFronterizo.add(paso);
    
    }
    
}
