package com.proyecto.ClubNautico.Projection.InterfaceBased.closed;

/*Autor: Pedro Garcia Rodríguez
 * Título: BarcoCloseView2
 * Propósito: Interfaz para implementar los DTO mediante interfaces tipo Close View. En este caso se omiten los datos de
 * Socio
 * Fecha: 2024/06/06
 * */

public interface BarcoClosedView2 {
    String getMatricula();
    String getNombre();
    int getNumamarre();
    float getCuota();
    SalidaClosedView getSalida();
}
