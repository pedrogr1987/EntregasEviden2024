package com.proyecto.ClubNautico.Services;

/*Autor: Pedro Garcia Rodríguez
 * Título: BarcoServiceImp
 * Propósito: Clase donde se implementan los métodos de la interfaz SocioService y del repositorio SocioRepository
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Socio;
import com.proyecto.ClubNautico.Projection.InterfaceBased.closed.BarcoClosedView;
import com.proyecto.ClubNautico.Projection.InterfaceBased.closed.SocioClosedView;
import com.proyecto.ClubNautico.Repository.SocioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class SocioServiceImp implements SocioService{
    @Autowired
    SocioRepository socioRepository;

    @Override
    public List<Socio> findAllSocios() {
        return socioRepository.findAll();
    }

    @Override
    public Socio saveSocio(Socio barco) {
        return socioRepository.save(barco);
    }

    @Override
    public Socio updateSocio(String id, Socio socio) {
        Socio barc = socioRepository.findById(id).get();
        if(Objects.nonNull(socio.getId()) && !"".equalsIgnoreCase(socio.getId())){
            barc.setId(socio.getId());
        }
        return socioRepository.save(barc);
    }

    @Override
    public void deleteSocio(String id) {
        socioRepository.deleteById(id);
    }

    @Override
    public List<SocioClosedView> findBy() {
        return socioRepository.findBy();
    }

    @Override
    public Optional<SocioClosedView> findSocioById(String id) {
        return socioRepository.findSocioById(id);
    }
}
