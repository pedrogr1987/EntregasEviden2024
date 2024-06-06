package com.proyecto.ClubNautico.Services;

/*Autor: Pedro Garcia Rodríguez
 * Título: BarcoServiceImp
 * Propósito: Clase donde se implementan los métodos de la interfaz BarcoService y del repositorio BarcoRepository
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Barco;
import com.proyecto.ClubNautico.Projection.InterfaceBased.closed.BarcoClosedView;
import com.proyecto.ClubNautico.Repository.BarcoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class BarcoServiceImp implements BarcoService{
    @Autowired
    BarcoRepository barcoRepository;

    @Override
    public List<Barco> findAllBarcos() {
        return barcoRepository.findAll();
    }

    @Override
    public Barco saveBarco(Barco barco) {
        return barcoRepository.save(barco);
    }

    @Override
    public Barco updateBarco(String matricula, Barco barco) {
        Barco barc = barcoRepository.findByMatricula(matricula).get();
        if(Objects.nonNull(barco.getMatricula()) && !"".equalsIgnoreCase(barco.getMatricula())){
            barc.setMatricula(barco.getMatricula());
        }
        if(Objects.nonNull(barco.getNombre()) && !"".equalsIgnoreCase(barco.getNombre())){
            barc.setNombre(barco.getNombre());
        }

        return barcoRepository.save(barc);
    }

    @Override
    public void deleteBarco(String Matricula) {
        barcoRepository.deleteById(Matricula);
    }

   @Override
    public List<BarcoClosedView> findBy() {
        return barcoRepository.findBy();
    }

   @Override
    public Optional<BarcoClosedView> findBarcoByMatricula(String matricula) {
        return barcoRepository.findBarcoByMatricula(matricula);
    }
}
