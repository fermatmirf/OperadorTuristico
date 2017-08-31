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
public class ServicioSalida {
    private float precio;
    private int cupo;
    private ServicioPrestador servicioprestador;
    private ServicioPaquete servicioPaquete;

    public ServicioSalida(float precio, int cupo, ServicioPrestador servicioprestador, ServicioPaquete servicioPaquete) {
        this.precio = precio;
        this.cupo = cupo;
        this.servicioprestador = servicioprestador;
        this.servicioPaquete = servicioPaquete;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public ServicioPrestador getServicioprestador() {
        return servicioprestador;
    }

    public void setServicioprestador(ServicioPrestador servicioprestador) {
        this.servicioprestador = servicioprestador;
    }

    public ServicioPaquete getServicioPaquete() {
        return servicioPaquete;
    }

    public void setServicioPaquete(ServicioPaquete servicioPaquete) {
        this.servicioPaquete = servicioPaquete;
    }

    @Override
    public String toString() {
        return "ServicioSalida{" + "precio=" + precio + ", cupo=" + cupo + ", servicioprestador=" + servicioprestador + ", servicioPaquete=" + servicioPaquete + '}';
    }

     
    
    
}
