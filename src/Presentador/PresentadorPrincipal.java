/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentador;

/**
 *
 * @author fermatmir
 */
public class PresentadorPrincipal {
    
  PresentadorPrincipal presentadorPrincipal;
  PresentadorSalidas presentadorSalidas;
  PresentadorPaquetes presentadorPaquetes;
  PresentadorModificarEstado presentadorModificarEstado;
  
  IVistaPrincipal vistaPrincipal;
  IVistaCrearSalida vistaCrearSalida;
  IVistaCrearPaquete vistaCrearPaquete;
  IVistaModificarEstado vistaModificarEstado;
  public PresentadorPrincipal(IVistaPrincipal view, IVistaCrearSalida view2, IVistaCrearPaquete view3, IVistaModificarEstado view4) {
    vistaPrincipal= view;
    vistaCrearSalida = view2;
    vistaCrearPaquete = view3;
    vistaModificarEstado = view4;

    presentadorSalidas = new PresentadorSalidas(vistaCrearSalida, vistaPrincipal);
    presentadorPaquetes = new PresentadorPaquetes(vistaCrearPaquete);
    presentadorModificarEstado = new PresentadorModificarEstado(vistaModificarEstado);
  }

  public void run() {
   vistaPrincipal.setPresenter(this);
   vistaPrincipal.updateViewFromModel();
   vistaPrincipal.open();
  }

  public void runCrearSalida() {
    vistaCrearSalida.setPresenter(presentadorSalidas);
    vistaCrearSalida.open();
  }

  public void runCrearPaquete() {
    vistaCrearPaquete.setPresenter(presentadorPaquetes);
    vistaCrearPaquete.updateViewFromModel();
    vistaCrearPaquete.open();
  }
  public void runModificarEstado() {
    vistaModificarEstado.setPresenter(presentadorModificarEstado);
    vistaModificarEstado.updateViewFromModel();
    vistaModificarEstado.open();
  }
}
