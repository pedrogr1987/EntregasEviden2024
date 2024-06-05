package com.proyecto.ClubNautico.Services;

/*Autor: Pedro Garcia Rodríguez
 * Título: SalidaService
 * Propósito: Interfaz servicio donde se ubican los métodos que se van a ser implementados posteriormente
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Salida;
import java.util.List;

public interface SalidaService {
    List<Salida> findAllSalidas();
    Salida saveSalida(Salida salida);
    Salida updateSalida(int id, Salida salida);
    void deleteSalida(int Id);
}
