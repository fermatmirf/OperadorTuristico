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
public class ServicioTransporte extends ServicioSalida {
    
    private int butaca;

    public ServicioTransporte(ServicioPrestador sprestador,int butaca, float precio, int cupo, ServicioPaquete servicioPaquete) {
        super(precio, cupo, sprestador, servicioPaquete);
        this.butaca = butaca;
    }

    public int getButaca() {
        return butaca;
    }

    public void setButaca(int butaca) {
        this.butaca = butaca;
    }

    @Override
    public String toString() {
        return "ServicioTransporte{" + "butaca=" + butaca + '}';
    }   
    
    
}
