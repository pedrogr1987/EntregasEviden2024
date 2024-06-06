package com.proyecto.ClubNautico.Projection.InterfaceBased.closed;

/*Autor: Pedro Garcia Rodríguez
 * Título: SalidaCloseView
 * Propósito: Interfaz para implementar los DTO mediante interfaces tipo Close View
 * Fecha: 2024/06/06
 * */

import com.proyecto.ClubNautico.Entity.Patron;

public interface SalidaClosedView {
    String getFecha();
    String getHora();
    String getDestino();
    Patron getPatron();
}
