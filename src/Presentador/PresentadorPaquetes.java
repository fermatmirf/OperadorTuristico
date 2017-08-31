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
    private Pais pais;
    private Provincia provincia;
    private Ciudad ciudorigen;
    private PasoFronterizo pasofronterizo;
    
    IVistaPrincipal vistaPrincipal;
    IVistaCrearPaquete vistaCrearPaquete;
    
    public PresentadorPaquetes(IVistaCrearPaquete vistaCrearPaquete, IVistaPrincipal vistaPrincipal){
        this.vistaCrearPaquete = vistaCrearPaquete;
        this.vistaPrincipal = vistaPrincipal;
    }
        
    public void iniciarCreacionPaquete(){
        p = new Paquete();
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
    
    public void seleccionarPais(Pais paiss){
        for(Pais pai : ClaseEstatica.paises){
            if(pai.equals(paiss)){
                this.pais = pai;
            }
        }
        this.mostrarProvincias(pais);
    }
    
    public void seleccionarProvincia(Provincia provin){
        for(Provincia prov : pais.getProvincias()){
            if(prov.equals(provin)){
                this.provincia = prov;
            }
        }
        this.mostrarCiudades(provincia);
    }
     
    public void seleccionarCiudadOrigen(Ciudad ciudad){
        for(Ciudad ciud : provincia.getCiudades()){
            if(ciud.equals(ciudad)){
                this.ciudorigen = ciud;
            }
        }
        p.setCiudorigen(ciudorigen);
    }
    
    public void seleccionarCiudadDestino(Ciudad ciudad){
        p.agregarCiudadDestino(ciudad);
    }
    
    public void seleccionarPasoFronterizo(PasoFronterizo pf){
        for(PasoFronterizo pfr : pais.getPasosFronterizo()){
            if(pfr.equals(pf)){
                this.pasofronterizo = pfr;
            }
        }
        p.agregarPasoFronterizo(pasofronterizo);
    }
    
    public void ingresarServicio(){}
    
    public void crearPaquete(){
        ClaseEstatica.paquetes.add(p);
    }
}
