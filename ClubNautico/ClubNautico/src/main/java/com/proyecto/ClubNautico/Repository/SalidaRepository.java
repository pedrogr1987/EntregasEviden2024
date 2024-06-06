package com.proyecto.ClubNautico.Repository;

/*Autor: Pedro Garcia Rodríguez
 * Título: SalidaRepository
 * Propósito: Interfaz donde se ubican los métodos que se van a ser implementados posteriormente en capas superiores
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Salida;
import com.proyecto.ClubNautico.Projection.InterfaceBased.closed.BarcoClosedView;
import com.proyecto.ClubNautico.Projection.InterfaceBased.closed.SalidaClosedView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SalidaRepository extends JpaRepository<Salida, String>{

    Optional<Salida> findById(int id);
    List<SalidaClosedView> findBy();
    Optional<SalidaClosedView> findSalidaById(int id);
}