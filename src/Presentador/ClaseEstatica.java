/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentador;

import Modelo.Ciudad;
import Modelo.Pais;
import Modelo.PasoFronterizo;
import Modelo.Prestador;
import Modelo.Provincia;
import Modelo.Rubro;
import Modelo.Servicio;
import Modelo.ServicioPaquete;
import Modelo.ServicioPrestador;
import Modelo.Tipo;
import java.util.ArrayList;

/**
 *
 * @author fermatmir
 */
public abstract class ClaseEstatica {

    public static ArrayList<Pais> paises = new ArrayList<>();
    public static ArrayList<ServicioPrestador> serviciosprestadores = new ArrayList<>();
    public static ArrayList<ServicioPaquete> serviciosDePaquetes = new ArrayList<>();
    public static ArrayList<Prestador> prestadores = new ArrayList<>();
    public static ArrayList<Rubro> rubros = new ArrayList<>();

    public void crearPaises() {
        Ciudad c1 = new Ciudad("Machu Pichu");
        Ciudad c2 = new Ciudad("Iguazo");
        Ciudad c3 = new Ciudad("Mar del Plata");
        Ciudad c4 = new Ciudad("Foz de Iguazu");

        Provincia p1 = new Provincia("Cusco");
        Provincia p2 = new Provincia("misiones");
        Provincia p3 = new Provincia("Buenos aires");
        Provincia p4 = new Provincia("brasilia");
        p1.agregarCiudad(c1);
        p2.agregarCiudad(c2);
        p3.agregarCiudad(c3);
        p4.agregarCiudad(c4);

        PasoFronterizo pf1 = new PasoFronterizo("Paso 1");
        PasoFronterizo pf2 = new PasoFronterizo("Paso 2");
        PasoFronterizo pf3 = new PasoFronterizo("Paso 3");
        PasoFronterizo pf4 = new PasoFronterizo("Paso 4");

        Pais pais1 = new Pais("Peru");
        Pais pais2 = new Pais("Argentina");
        Pais pais3 = new Pais("Uruguay");
        Pais pais4 = new Pais("Brazil");

        pais1.agregarPasoFronteriso(pf1);
        pais1.agregarProvincia(p1);
        pais2.agregarPasoFronteriso(pf2);
        pais2.agregarProvincia(p2);
        pais3.agregarPasoFronteriso(pf3);
        pais3.agregarProvincia(p3);
        pais4.agregarPasoFronteriso(pf4);
        pais4.agregarProvincia(p4);

    }

    public void crearServicioPrestador() {
        this.serviciosprestadores.add(new ServicioPrestador("Hilton"));
        this.serviciosprestadores.add(new ServicioPrestador("Flecha Bus"));
        this.serviciosprestadores.add(new ServicioPrestador("Sheraton"));
        this.serviciosprestadores.add(new ServicioPrestador("Veloz del norte"));
    }

    public void crearPrestadores() {
        this.prestadores.add(new Prestador("Tranporte", "111", "5551", "alem 123"));
        this.prestadores.add(new Prestador("Alojamiento", "222", "5552", "alem 456"));
        this.prestadores.add(new Prestador("Paseo", "333", "5553", "alem 234"));
        this.prestadores.add(new Prestador("compras", "444", "5554", "alem 678"));
    }

    public void crearRubros() {
        Tipo tipo1 = new Tipo("Omnibus");
        Tipo tipo2 = new Tipo("Hotel");
        tipo1.agregar(new Servicio("Butaca"));
        tipo2.agregar(new Servicio("Noche de Hotel"));

        Rubro rubros1 = new Rubro("transporte");
        Rubro rubros2 = new Rubro("alojamiento");
        Rubro rubros3 = new Rubro("excurision");
        rubros1.agregarTipos(tipo1);
        rubros2.agregarTipos(tipo2);

    }

    public void inicializar() {
        crearPaises();
        crearPrestadores();
        crearRubros();
        crearServicioPrestador();
    }

}
