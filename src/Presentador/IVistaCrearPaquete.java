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
public interface IVistaCrearPaquete {
        
  PresentadorPaquetes getPresenter();

  void setPresenter(PresentadorPaquetes presentadorPaquetes);

  void updateModelFromView();

  void updateViewFromModel();

  void open();

  void close();
}
