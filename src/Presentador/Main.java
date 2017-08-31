/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentador;

import Modelo.ControlarEstadosSalidas;
import java.util.Timer;

/**
 *
 * @author fermatmir
 */
public class Main {

    public static void main(String[] args) {
        Timer t = new Timer();
        ControlarEstadosSalidas ces = new ControlarEstadosSalidas(salidas);
        // This task is scheduled to run every 10 seconds

        t.scheduleAtFixedRate(ces, 0, 3600000);
    }
}
