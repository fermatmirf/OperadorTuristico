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
public interface IVistaModificarEstado {
        
  PresentadorModificarEstado getPresenter();

  void setPresenter(PresentadorModificarEstado presentadorModificarEstado);

  void updateModelFromView();

  void updateViewFromModel();

  void open();

  void close();
}
