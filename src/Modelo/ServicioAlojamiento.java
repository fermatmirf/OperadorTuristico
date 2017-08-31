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
public class ServicioAlojamiento extends ServicioSalida {
    private int cantidadEstrellas;

    public ServicioAlojamiento(ServicioPrestador servicioprestador, int cantidadEstrellas, float precio, int cupo) {
        super(servicioprestador, precio, cupo);
        this.cantidadEstrellas = cantidadEstrellas;
    }
    


    public int getCantidadEstrellas() {
        return cantidadEstrellas;
    }

    public void setCantidadEstrellas(int cantidadEstrellas) {
        this.cantidadEstrellas = cantidadEstrellas;
    }

    @Override
    public String toString() {
        return "ServicioAlojamiento{" + "cantidadEstrellas=" + cantidadEstrellas + '}';
    }
    
    
    
    
}
