package com.proyecto.ClubNautico.Repository;

/*Autor: Pedro Garcia Rodríguez
 * Título: SocioRepository
 * Propósito: Interfaz donde se ubican los métodos que se van a ser implementados posteriormente en capas superiores
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Socio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocioRepository extends JpaRepository<Socio, String>{
    // Socio findByid(String id);
    // Barco findByBarco(String Barco);
    // Optional<Socio> findByBarco(String barco);
}