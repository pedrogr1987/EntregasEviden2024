package com.proyecto.ClubNautico.Services;

/*Autor: Pedro Garcia Rodríguez
 * Título: PatronServiceImp
 * Propósito: Clase donde se implementan los métodos de la interfaz PatronService y del repositorio PatronRepository
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Patron;
import com.proyecto.ClubNautico.Repository.PatronRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Objects;

@Component
public class PatronServiceImp implements PatronService{
    @Autowired
    PatronRepository patronRepository;

    @Override
    public List<Patron> findAllPatrones() {
        return patronRepository.findAll();
    }

    @Override
    public Patron savePatron(Patron patron) {
        return patronRepository.save(patron);
    }

    @Override
    public Patron updatePatron(String dni, Patron patron) {
        Patron patro = patronRepository.findByDni(dni).get();
        if(Objects.nonNull(patron.getNombre()) && !"".equalsIgnoreCase(patron.getNombre())){
            patro.setNombre(patron.getNombre());
        }
        if(Objects.nonNull(patron.getApellidos()) && !"".equalsIgnoreCase(patron.getApellidos())){
            patro.setApellidos(patron.getApellidos());
        }
        return patronRepository.save(patro);
    }

    @Override
    public void deletePatron(String dni) {

        patronRepository.deleteById(dni);
    }
}
