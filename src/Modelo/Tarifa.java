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
public class Tarifa {
    private Base base;
    private float precio;

    public Tarifa(Base base, float precio) {
        this.base = base;
        this.precio = precio;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
