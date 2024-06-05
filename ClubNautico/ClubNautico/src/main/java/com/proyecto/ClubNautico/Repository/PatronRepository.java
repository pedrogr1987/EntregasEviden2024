package com.proyecto.ClubNautico.Repository;

/*Autor: Pedro Garcia Rodríguez
 * Título: PatronRepository
 * Propósito: Interfaz donde se ubican los métodos que se van a ser implementados posteriormente en capas superiores
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Patron;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface PatronRepository extends JpaRepository<Patron, String>{
/*
Estos métodos se crearon pero no fueron usados posteriormente
    Patron findByNombre(String nombre);
    //Barco findByMatricula(String matricula);*/
    //Este método permite buscar por el atributo DNI un patron en la base de datos
    Optional<Patron> findByDni(String dni);
}