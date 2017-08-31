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
public class Salida {
    
    private int numero,  cupo;
    private String fecha;
    private EstadoSalida estado;
    private ArrayList<Tarifa> tarifas;
    private ArrayList<ServicioSalida> serviciosalidas;
    
    public Salida(){
        this.estado = EstadoSalida.CREADO;
        this.tarifas = new ArrayList<>();
        this.serviciosalidas = new ArrayList<>();
    }
    
    public Salida(int numero, int cupo, String fecha, EstadoSalida estado) {
        this.numero = numero;
        this.cupo = cupo;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public EstadoSalida getEstado() {
        return estado;
    }

    public void setEstado(EstadoSalida estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Salida{" + "numero=" + numero + ", cupo=" + cupo + ", fecha=" + fecha + ", estado=" + estado + '}';
    }

    public void crearServicioSalida(ServicioPrestador servicioprestador, float precio, int cupo, ServicioPaquete servicioPaquete) {
        ServicioSalida ssalida = new ServicioSalida(precio, cupo, servicioprestador, servicioPaquete);
        serviciosalidas.add(ssalida);
    }

    public void crearTarifa(Base base, float precio) {
       Tarifa tarifa = new Tarifa(base,precio);
       tarifas.add(tarifa);
    }

  
    
}
