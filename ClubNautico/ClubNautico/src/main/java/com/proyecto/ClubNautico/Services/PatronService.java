package com.proyecto.ClubNautico.Services;

/*Autor: Pedro Garcia Rodríguez
 * Título: PatronService
 * Propósito: Interfaz servicio donde se ubican los métodos que se van a ser implementados posteriormente
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Patron;
import java.util.List;

public interface PatronService {
    List<Patron> findAllPatrones();
    Patron savePatron(Patron patron);
    Patron updatePatron(String Dni, Patron patron);
    void deletePatron(String dni);
}
