package com.proyecto.ClubNautico.Projection.InterfaceBased.closed;

/*Autor: Pedro Garcia Rodríguez
 * Título: SocioCloseView
 * Propósito: Interfaz para implementar los DTO mediante interfaces tipo Close View
 * Fecha: 2024/06/06
 * */

import com.proyecto.ClubNautico.Entity.Patron;

import java.util.List;

public interface SocioClosedView {
    Patron getDatos();
    List<BarcoClosedView2> getBarcos();
}
