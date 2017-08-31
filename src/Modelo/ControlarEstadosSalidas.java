/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.TimerTask;

/**
 *
 * @author au6usto
 */
public class ControlarEstadosSalidas extends TimerTask {
    private ArrayList<Salida> salidas;
    ZoneId zonedId = ZoneId.of( "America/Argentina/Buenos_Aires" );    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        
    public ControlarEstadosSalidas(ArrayList<Salida> salidas) {
        this.salidas = salidas;
        formatter = formatter.withZone(zonedId);
        this.cambiarAEstadoEnEjecucion();
        this.cambiarAEstadoFinalizado();
    }
    
    public void cambiarAEstadoEnEjecucion() {
        for (Salida salida : salidas) {
            LocalDate fechaSalida = LocalDate.parse(salida.getFecha(), formatter);
            LocalDate today = LocalDate.now( zonedId );
            if (fechaSalida == today && salida.getEstado() == EstadoSalida.EN_VENTA) {
                salida.setEstado(EstadoSalida.EJECUCION);
            }
        }
    }
    
    public void cambiarAEstadoFinalizado() {
        for (Salida salida : salidas) {
            LocalDate fechaFinalizacion = LocalDate.parse(salida.getFecha(), formatter);
            fechaFinalizacion.plusDays(15);
            LocalDate today = LocalDate.now( zonedId );
            if (fechaFinalizacion == today && salida.getEstado() == EstadoSalida.EJECUCION) {
                salida.setEstado(EstadoSalida.FINALIZADO);
            }
        }
    }

    @Override
    public void run() {
        System.out.println("Pasó 1 hora");
    }
    
}
