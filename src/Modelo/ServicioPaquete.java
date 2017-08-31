/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author fermatmir
 */
public class ServicioPaquete {
    private int desdeDias;
    private int hastaDias;
    private Servicio servicio;

    public ServicioPaquete(Servicio s,int desdeDias, int hastaDias) {
        this.desdeDias = desdeDias;
        this.hastaDias = hastaDias;
        this.servicio = s;
    }

    public int getDesdeDias() {
        return desdeDias;
    }

    public void setDesdeDias(int desdeDias) {
        this.desdeDias = desdeDias;
    }

    public int getHastaDias() {
        return hastaDias;
    }

    public void setHastaDias(int hastaDias) {
        this.hastaDias = hastaDias;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "ServicioPaquete{" + "desdeDias=" + desdeDias + ", hastaDias=" + hastaDias + ", servicio=" + servicio + '}';
    }
    
    
    
}
