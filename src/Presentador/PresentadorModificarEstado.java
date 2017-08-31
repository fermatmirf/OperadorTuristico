/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentador;

import Modelo.Paquete;
import java.util.ArrayList;

/**
 *
 * @author fermatmir
 */
public class PresentadorModificarEstado {
    IVistaModificarEstado vistaModificarEstado;
    
    public PresentadorModificarEstado(IVistaModificarEstado vistaModificarEstado){
        this.vistaModificarEstado = vistaModificarEstado;
    }
    
    public ArrayList<Paquete> mostrarPaquetes() {
        return ClaseEstatica.paquetes;
    }
}
