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
public class Tipo {
    private String descripcion;
    private ArrayList<Servicio> servicios = new ArrayList<>();

    public Tipo(String desc) {
        this.descripcion = desc;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }
    
    public void agregar(Servicio s) {
        this.servicios.add(s);
    }
        
}
