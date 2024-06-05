package com.proyecto.ClubNautico.Services;

/*Autor: Pedro Garcia Rodríguez
 * Título: BarcoService
 * Propósito: Interfaz servicio donde se ubican los métodos que se van a ser implementados posteriormente
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Barco;
import java.util.List;

public interface BarcoService {
    List<Barco> findAllBarcos();
    Barco saveBarco(Barco barco);
    Barco updateBarco(String Matricula, Barco barco);
    void deleteBarco(String matricula);
}
