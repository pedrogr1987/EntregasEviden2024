package com.proyecto.ClubNautico.Projection.InterfaceBased.closed;
/*Autor: Pedro Garcia Rodríguez
 * Título: BarcoCloseView
 * Propósito: Interfaz para implementar los DTO mediante interfaces tipo Close View
 * Fecha: 2024/06/06
 * */

public interface BarcoClosedView {
    String getMatricula();
    String getNombre();
    int getNumamarre();
    float getCuota();
    SocioClosedView2 getSocio();
    SalidaClosedView getSalida();
}
