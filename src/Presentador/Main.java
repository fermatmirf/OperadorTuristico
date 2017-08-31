/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentador;

import Modelo.ControlarEstadosSalidas;
import Vista.*;
import java.util.Timer;

/**
 *
 * @author fermatmir
 */
public class Main {

    public static void main(String[] args) {
        Timer t = new Timer();
        ControlarEstadosSalidas ces = new ControlarEstadosSalidas(ClaseEstatica.paquetes);
        t.scheduleAtFixedRate(ces, 0, 3600000);

        VistaPrincipal vistaPrincipal = new VistaPrincipal();
        VistaCrearSalida vistaCrearSalida = new VistaCrearSalida();
        VistaCrearPaquete vistaCrearPaquete = new VistaCrearPaquete();
        VistaModificarEstado vistaModificarEstado = new VistaModificarEstado();

        PresentadorPrincipal presentadorPrincipal = new PresentadorPrincipal(vistaPrincipal, vistaCrearSalida, vistaCrearPaquete, vistaModificarEstado);

        presentadorPrincipal.run();
    }
}
