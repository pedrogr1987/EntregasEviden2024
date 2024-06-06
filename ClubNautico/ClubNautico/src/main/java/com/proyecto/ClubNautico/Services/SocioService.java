package com.proyecto.ClubNautico.Services;

/*Autor: Pedro Garcia Rodríguez
 * Título: SocioService
 * Propósito: Interfaz servicio donde se ubican los métodos que se van a ser implementados posteriormente
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Socio;
import com.proyecto.ClubNautico.Projection.InterfaceBased.closed.BarcoClosedView;
import com.proyecto.ClubNautico.Projection.InterfaceBased.closed.SocioClosedView;

import java.util.List;
import java.util.Optional;

public interface SocioService {
    List<Socio> findAllSocios();
    Socio saveSocio(Socio socio);
    Socio updateSocio(String id, Socio socio);
    void deleteSocio(String id);
    Optional<SocioClosedView> findSocioById(String id);
    List<SocioClosedView> findBy();
}
