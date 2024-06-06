package com.proyecto.ClubNautico.Repository;

/*Autor: Pedro Garcia Rodríguez
 * Título: SocioRepository
 * Propósito: Interfaz donde se ubican los métodos que se van a ser implementados posteriormente en capas superiores
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Socio;
import com.proyecto.ClubNautico.Projection.InterfaceBased.closed.BarcoClosedView;
import com.proyecto.ClubNautico.Projection.InterfaceBased.closed.SocioClosedView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SocioRepository extends JpaRepository<Socio, String>{
    List<SocioClosedView> findBy();
    Optional<SocioClosedView> findSocioById(String Id);
}