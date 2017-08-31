/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentador;

import Modelo.EstadoSalida;
import Modelo.Paquete;
import Modelo.Salida;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fermatmir
 */
public class PresentadorModificarEstado {
    IVistaModificarEstado vistaModificarEstado;
    private Paquete paquete;
    private Salida salida;
    
    public PresentadorModificarEstado(IVistaModificarEstado vistaModificarEstado){
        this.vistaModificarEstado = vistaModificarEstado;
    }
    
    public ArrayList<Paquete> mostrarPaquetes() {
        return ClaseEstatica.paquetes;
    }
    
    public void iniciarModificarEstado(Paquete p){
        for(Paquete paq : ClaseEstatica.paquetes){
            if(paq.equals(p)){
                this.paquete = paq;
            }
        }
    }
    public DefaultTableModel getSalidas(Object p){
        Paquete p2 = (Paquete) p;
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Id");
        table.addColumn("Nombre");
        table.addColumn("Estado");
        for (Salida salida : p2.getSalidas()) {
            Object[] row = new Object[2];
            row[0] = salida.getNumero();
            row[1] = salida.getEstado();
            table.addRow(row);
        }
        return table;
    }
    
    public void seleccionarSalida(Salida sal, EstadoSalida es){
        for(Salida s : paquete.getSalidas()){
            if(s.equals(sal)){
                s.setEstado(es);
            }
        }
    }
}
