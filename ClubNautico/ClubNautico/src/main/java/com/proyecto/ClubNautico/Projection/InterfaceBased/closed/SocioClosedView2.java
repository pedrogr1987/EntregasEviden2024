package com.proyecto.ClubNautico.Projection.InterfaceBased.closed;
/*Autor: Pedro Garcia Rodríguez
 * Título: SocioCloseView2
 * Propósito: Interfaz para implementar los DTO mediante interfaces tipo Close View. En este caso repetimos interfaz
 * para la Clase Socio pero sin los datos de Barco. El motivo de esto es poder usarlo en los métodos en los que ya obte-
 * nemos la información de los barcos anteriormente.
 * Fecha: 2024/06/06
 * */
import com.proyecto.ClubNautico.Entity.Patron;

import java.util.List;

public interface SocioClosedView2 {
    Patron getDatos();
}
