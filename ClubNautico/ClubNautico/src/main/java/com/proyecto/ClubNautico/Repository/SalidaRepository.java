package com.proyecto.ClubNautico.Repository;

/*Autor: Pedro Garcia Rodríguez
 * Título: SalidaRepository
 * Propósito: Interfaz donde se ubican los métodos que se van a ser implementados posteriormente en capas superiores
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Salida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface SalidaRepository extends JpaRepository<Salida, String>{
/*
Estos métodos se crearon pero no fueron usados posteriormente
    Salida findByDestino(String destino);
    //Salida findById(int id);*/

    //Este método permite buscar por el atributo id una salida en la base de datos
    Optional<Salida> findById(int id);
}