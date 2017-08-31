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
public class Paquete {
   private String nombre;
   private String descripcion;
   private String itinerario;
   private String condcomerciales;
   private int cantdias;
   private int cantnoches;
   private Ciudad ciudorigen;
   private Ciudad ciuddestino;
   private ArrayList<Ciudad> ciudadDestino;
   private ArrayList<PasoFronterizo> pasosFronterizos;
   private ArrayList<ServicioPaquete> serviciosPaquetes;
   private ArrayList<Salida> salidas;
   private EstadoPaquete estado;

   
   public Paquete(){
       this.estado = estado.CREADO;
       this.ciudadDestino = new ArrayList<>();
       this.pasosFronterizos = new ArrayList<>();
       this.serviciosPaquetes  = new ArrayList<>();
       this.salidas = new ArrayList<>();
   }

    public void añadirCiudadOrigen(Ciudad co){
        this.ciudorigen = co; 
    }
    
    public void añadirCiudadDestino(Ciudad cd){
        this.ciudadDestino.add(cd); 
    }
    
    public void añadirPasoFronterizo(PasoFronterizo pf){
        this.pasosFronterizos.add(pf); 
    }
    
    public void añadirServicio(Servicio s, int desde, int hasta){
        ServicioPaquete sp = new ServicioPaquete(s,desde, hasta);
        this.serviciosPaquetes.add(sp);
    }
    
    public void crearPaquete(String nom, String itin, String desc, String condc, int cantd, int cantn, EstadoPaquete estado){
        this.nombre = nom;
        this.itinerario = itin;
        this.descripcion = desc;
        this.condcomerciales = condc;
        this.cantdias = cantd;
        this.cantnoches = cantn;
        this.estado = estado;
    }

}
