/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentador;

import Modelo.Base;
import Modelo.Paquete;
import Modelo.ServicioPaquete;
import Modelo.ServicioPrestador;
import java.util.ArrayList;

/**
 *
 * @author fermatmir
 */
public class PresentadorSalidas {
    
    IVistaCrearSalida vistaCrearSalida;
    private Paquete paquete;
    private ServicioPrestador servicioprestador;
   
    
    public PresentadorSalidas(IVistaCrearSalida vistaCrearSalida){
        this.vistaCrearSalida = vistaCrearSalida;
    }
    
    public void iniciarCreacionSalida(Paquete paq){
        for(Paquete p : ClaseEstatica.paquetes){
            if(p.equals(paq)){
                paquete = paq;
            }
        }
        this.paquete.crearSalida();
    }
    
    public ArrayList<Paquete> mostrarPaquetes() {
        return ClaseEstatica.paquetes;
    }
    
  
    public void ingresarServicioPrestador(String nombre, float precio, int cupo, ServicioPaquete servicioPaquete){
        if(!nombre.isEmpty()){
            for(ServicioPrestador sp : ClaseEstatica.serviciosprestadores){
                if(sp.getNombre().equals(nombre)){
                    servicioprestador = sp;
                }
            }
            
        }
        paquete.crearServicioSalida(servicioprestador,precio,cupo, servicioPaquete);    
        
    }
    
    public void crearSalida(Base base, float precio, int cupo, String fecha){
        this.paquete.crearTarifa(base, precio);
        this.paquete.agregarSalida(cupo,fecha);
    }
}
