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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }

    public ArrayList<PasoFronterizo> getPasosFronterizo() {
        return pasosFronterizo;
    }

    public void setPasosFronterizo(ArrayList<PasoFronterizo> pasosFronterizo) {
        this.pasosFronterizo = pasosFronterizo;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", provincias=" + provincias + ", pasosFronterizo=" + pasosFronterizo + '}';
    }
    
}
