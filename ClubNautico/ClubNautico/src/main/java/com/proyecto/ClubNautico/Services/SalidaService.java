package com.proyecto.ClubNautico.Services;

/*Autor: Pedro Garcia Rodríguez
 * Título: SalidaService
 * Propósito: Interfaz servicio donde se ubican los métodos que se van a ser implementados posteriormente
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Salida;
import com.proyecto.ClubNautico.Projection.InterfaceBased.closed.BarcoClosedView;
import com.proyecto.ClubNautico.Projection.InterfaceBased.closed.SalidaClosedView;

import java.util.List;
import java.util.Optional;

public interface SalidaService {
    List<Salida> findAllSalidas();
    Salida saveSalida(Salida salida);
    Salida updateSalida(int id, Salida salida);
    void deleteSalida(int Id);
    List<SalidaClosedView> findBy();
    Optional<SalidaClosedView> findSalidaById(int id);
}
