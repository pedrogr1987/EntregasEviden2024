package com.proyecto.ClubNautico.Services;

/*Autor: Pedro Garcia Rodríguez
 * Título: BarcoService
 * Propósito: Interfaz servicio donde se ubican los métodos que se van a ser implementados posteriormente
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Barco;
import com.proyecto.ClubNautico.Projection.InterfaceBased.closed.BarcoClosedView;

import java.util.List;
import java.util.Optional;

public interface BarcoService {
    List<Barco> findAllBarcos();
    Barco saveBarco(Barco barco);
    Barco updateBarco(String Matricula, Barco barco);
    void deleteBarco(String matricula);
    List<BarcoClosedView> findBy();
    Optional<BarcoClosedView> findBarcoByMatricula(String matricula);

}
