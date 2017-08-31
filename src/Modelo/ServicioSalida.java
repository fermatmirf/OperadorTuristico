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

    public ServicioSalida(ServicioPrestador sprestador,float precio, int cupo) {
        this.precio = precio;
        this.cupo = cupo;
        this.servicioprestador = sprestador;
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

    @Override
    public String toString() {
        return "ServicioSalida{" + "precio=" + precio + ", cupo=" + cupo + '}';
    }
    
    
    
}
