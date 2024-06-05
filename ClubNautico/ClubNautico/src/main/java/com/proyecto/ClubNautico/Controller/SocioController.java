package com.proyecto.ClubNautico.Controller;

/*Autor: Pedro Garcia Rodríguez
 * Título: SocioController
 * Propósito: Clase donde se crean los endpoints invocando a los métodos desarrollados en capas inferiores
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Socio;
import com.proyecto.ClubNautico.Services.SocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class SocioController {
    @Autowired
    SocioService socioService;

    //Este método nos devuelve todos los socios mediante un GET, cumpliendo la función READ
    @GetMapping("/findAllSocios")
    public List<Socio> findAllSocios(){
        return socioService.findAllSocios();
    }

    //Este método guarda un socio creado, mediante un método POST, cumpliendo la función CREATE
    @PostMapping("/saveSocio")
    public Socio saveSocio(@RequestBody Socio socio) {
        return socioService.saveSocio(socio);
    }

    //Este método actualiza el socio al cual accedemos mediante su id mediante un PUT, cumpliendo la función UPDATE
    @PutMapping("/updateSocio/{id}")
    public Socio updateSocio(@PathVariable String id, @RequestBody Socio socio){
        return socioService.updateSocio(id, socio);
    }

    //Este método elimina un socio de la base de datos introduciendo su id mediante un DELETE, cumpliendo la función del mismo nombre
    @DeleteMapping("/deleteSocio/{id}")
    public String deleteSocio(@PathVariable String id) {
        socioService.deleteSocio(id);
        return "Se ha borrado el socio del sistema";
    }

    }

