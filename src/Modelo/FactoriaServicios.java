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
public class FactoriaServicios {
    
    public static ServicioSalida crearServicio(String tiposervicio, ServicioPrestador sp, int butaca, int estrellas, float precio, int cupo){
        ServicioSalida s = null;
        
        if(tiposervicio == "Alojamiento"){
             s = new ServicioAlojamiento(sp,estrellas, precio, cupo);
        }
        else{
             s = new ServicioTransporte(sp, butaca, precio, cupo);
        }
        return s;
    }
}
