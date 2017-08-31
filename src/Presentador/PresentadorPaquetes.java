package Presentador;

import Modelo.Ciudad;
import Modelo.Pais;
import Modelo.Paquete;
import Modelo.PasoFronterizo;
import Modelo.Provincia;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fermatmir
 */
public class PresentadorPaquetes {
    private Paquete p; 
    
    IVistaPrincipal vistaPrincipal;
    IVistaCrearPaquete vistaCrearPaquete;
    
    public PresentadorPaquetes(IVistaCrearPaquete vistaCrearPaquete, IVistaPrincipal vistaPrincipal){
        this.vistaCrearPaquete = vistaCrearPaquete;
        this.vistaPrincipal = vistaPrincipal;
    }
        
    public void iniciarCreacionPaquete(){
        p = new Paquete();
    }
    
    public void seleccionarCiudadOrigen(Ciudad ciudad){
        p.setCiudorigen(ciudad);
    }
    
    public ArrayList<Pais> mostrarPaises(){
        return ClaseEstatica.paises;
    }
    
    public ArrayList<Provincia> mostrarProvincias(Pais pais){
        return pais.getProvincias();
    }
    
    public ArrayList<Ciudad> mostrarCiudades(Provincia prov){
        return prov.getCiudades();
    }
    
    public ArrayList<PasoFronterizo> mostrarPasosFronterizos(Pais pais){
        return pais.getPasosFronterizo();
    }
    
    public void seleccionarPais(Pais pais){
        this.mostrarProvincias(pais);
    }
    
    public void seleccionarProvincia(Provincia prov){
        this.mostrarCiudades(prov);
    }

    public void seleccionarCiudadDestino(Ciudad ciudad){
        p.agregarCiudadDestino(ciudad);
    }
    
    public void seleccionarPasoFronterizo(PasoFronterizo pf){
        p.agregarPasoFronterizo(pf);
    }
    
    public void ingresarServicio(){}
    
    public void crearPaquete(){
        ClaseEstatica.paquetes.add(p);
    }
}
