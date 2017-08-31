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
    
}
