package com.proyecto.ClubNautico.Services;

/*Autor: Pedro Garcia Rodríguez
 * Título: PatronService
 * Propósito: Interfaz servicio donde se ubican los métodos que se van a ser implementados posteriormente
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Patron;
import com.proyecto.ClubNautico.Projection.InterfaceBased.closed.BarcoClosedView;
import com.proyecto.ClubNautico.Projection.InterfaceBased.closed.PatronClosedView;

import java.util.List;
import java.util.Optional;

public interface PatronService {
    List<Patron> findAllPatrones();
    Patron savePatron(Patron patron);
    Patron updatePatron(String Dni, Patron patron);
    void deletePatron(String dni);
    List<PatronClosedView> findBy();
    Optional<PatronClosedView> findPatronByDni(String dni);
}
