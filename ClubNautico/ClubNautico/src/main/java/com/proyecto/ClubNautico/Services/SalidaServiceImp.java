package com.proyecto.ClubNautico.Services;

/*Autor: Pedro Garcia Rodríguez
 * Título: BarcoServiceImp
 * Propósito: Clase donde se implementan los métodos de la interfaz SalidaService y del repositorio SalidaRepository
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Salida;
import com.proyecto.ClubNautico.Projection.InterfaceBased.closed.BarcoClosedView;
import com.proyecto.ClubNautico.Projection.InterfaceBased.closed.SalidaClosedView;
import com.proyecto.ClubNautico.Repository.SalidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class SalidaServiceImp implements SalidaService{
    @Autowired
    SalidaRepository salidaRepository;

    @Override
    public List<Salida> findAllSalidas() {
        return salidaRepository.findAll();
    }

    @Override
    public Salida saveSalida(Salida barco) {
        return salidaRepository.save(barco);
    }

    @Override
    public Salida updateSalida(int id, Salida salida) {
        Salida salid = salidaRepository.findById(id).get();
        if(Objects.nonNull(salida.getId()) && !"".equalsIgnoreCase(String.valueOf(salida.getId()))){
            salid.setId(salida.getId());
        }
        if(Objects.nonNull(salida.getDestino()) && !"".equalsIgnoreCase(salida.getDestino())){
            salid.setDestino(salida.getDestino());
        }
        return salidaRepository.save(salid);
    }

    @Override
    public void deleteSalida(int id) {
        salidaRepository.deleteById(String.valueOf(id));

    }
    @Override
    public List<SalidaClosedView> findBy() {
        return salidaRepository.findBy();
    }

    @Override
    public Optional<SalidaClosedView> findSalidaById(int id) {
        return salidaRepository.findSalidaById(id);
    }
}
