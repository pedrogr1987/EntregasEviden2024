package com.proyecto.ClubNautico.Repository;

/*Autor: Pedro Garcia Rodríguez
 * Título: BarcoRepository
 * Propósito: Interfaz donde se ubican los métodos que se van a ser implementados posteriormente en capas superiores
 * Fecha: 2024/06/05
 * */

import java.util.Optional;
import com.proyecto.ClubNautico.Entity.Barco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarcoRepository extends JpaRepository<Barco, String>{
/*
Estos métodos se crearon pero no fueron usados posteriormente
    Barco findByNombre(String nombre);

    //Barco findByMatricula(String matricula);*/
    //Este método permite buscar por el atributo matrícula un barco en la base de datos
    Optional<Barco> findByMatricula(String matricula);
}