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
   private Salida salida;
   
   public Paquete(){
       this.estado = estado.CREADO;
       this.ciudadDestino = new ArrayList<>();
       this.pasosFronterizos = new ArrayList<>();
       this.serviciosPaquetes  = new ArrayList<>();
       this.salidas = new ArrayList<>();
   }
  
    public void agregarCiudadDestino(Ciudad cd){
        this.ciudadDestino.add(cd); 
    }
    
    public void agregarPasoFronterizo(PasoFronterizo pf){
        this.pasosFronterizos.add(pf); 
    }
    
    public void agregarServicio(Servicio s, int desde, int hasta){
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
    
    public void crearSalida(){
        this.salida = new Salida();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getItinerario() {
        return itinerario;
    }

    public void setItinerario(String itinerario) {
        this.itinerario = itinerario;
    }

    public String getCondcomerciales() {
        return condcomerciales;
    }

    public void setCondcomerciales(String condcomerciales) {
        this.condcomerciales = condcomerciales;
    }

    public int getCantdias() {
        return cantdias;
    }

    public void setCantdias(int cantdias) {
        this.cantdias = cantdias;
    }

    public int getCantnoches() {
        return cantnoches;
    }

    public void setCantnoches(int cantnoches) {
        this.cantnoches = cantnoches;
    }

    public Ciudad getCiudorigen() {
        return ciudorigen;
    }

    public void setCiudorigen(Ciudad ciudorigen) {
        this.ciudorigen = ciudorigen;
    }

    public Ciudad getCiuddestino() {
        return ciuddestino;
    }

    public void setCiuddestino(Ciudad ciuddestino) {
        this.ciuddestino = ciuddestino;
    }

    public ArrayList<Ciudad> getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(ArrayList<Ciudad> ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public ArrayList<PasoFronterizo> getPasosFronterizos() {
        return pasosFronterizos;
    }

    public void setPasosFronterizos(ArrayList<PasoFronterizo> pasosFronterizos) {
        this.pasosFronterizos = pasosFronterizos;
    }

    public ArrayList<ServicioPaquete> getServiciosPaquetes() {
        return serviciosPaquetes;
    }

    public void setServiciosPaquetes(ArrayList<ServicioPaquete> serviciosPaquetes) {
        this.serviciosPaquetes = serviciosPaquetes;
    }

    public ArrayList<Salida> getSalidas() {
        return salidas;
    }

    public void setSalidas(ArrayList<Salida> salidas) {
        this.salidas = salidas;
    }

    public EstadoPaquete getEstado() {
        return estado;
    }

    public void setEstado(EstadoPaquete estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paquete{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", itinerario=" + itinerario + ", condcomerciales=" + condcomerciales + ", cantdias=" + cantdias + ", cantnoches=" + cantnoches + ", ciudorigen=" + ciudorigen + ", ciuddestino=" + ciuddestino + ", ciudadDestino=" + ciudadDestino + ", pasosFronterizos=" + pasosFronterizos + ", serviciosPaquetes=" + serviciosPaquetes + ", salidas=" + salidas + ", estado=" + estado + '}';
    }

    public void crearServicioSalida(ServicioPrestador servicioprestador, float precio, int cupo) {
       this.salida.crearServicioSalida(servicioprestador, precio, cupo);
    }

    public void crearTarifa(Base base, float precio) {
        this.salida.crearTarifa(base, precio);
    }

    public void agregarSalida(int cupo, String fecha) {
        this.salida.setCupo(cupo);
        this.salida.setFecha(fecha);
        this.salida.setEstado(EstadoSalida.EJECUCION);
        this.salidas.add(salida);
    }
    
    

}
