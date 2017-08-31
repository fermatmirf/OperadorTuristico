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
public class Rubro {
    private String descripcion;
    private ArrayList<Tipo> tipos = new ArrayList<>();

    public Rubro() {
    }

    public Rubro(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void agregarTipos(Tipo t){
    this.tipos.add(t);
    
    }

    public ArrayList<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(ArrayList<Tipo> tipos) {
        this.tipos = tipos;
    }

    @Override
    public String toString() {
        return "Rubro{" + "descripcion=" + descripcion + ", tipos=" + tipos + '}';
    }
    
    
}
