package com.proyecto.ClubNautico.Controller;

/*Autor: Pedro Garcia Rodríguez
 * Título: SalidaController
 * Propósito: Clase donde se crean los endpoints invocando a los métodos desarrollados en capas inferiores
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Salida;
import com.proyecto.ClubNautico.Services.SalidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class SalidaController {
    @Autowired
    SalidaService salidaService;

    //Este método nos devuelve todos las salidas mediante un GET, cumpliendo la función READ
    @GetMapping("/findAllSalidas")
    public List<Salida> findAllSalidas(){
        return salidaService.findAllSalidas();
    }

    //Este método guarda una salida creada, mediante un método POST, cumpliendo la función CREATE
    @PostMapping("/saveSalida")
    public Salida saveSalida(@RequestBody Salida salida) {
        return salidaService.saveSalida(salida);
    }

    //Este método actualiza la salida al cual accedemos mediante su DNI mediante un PUT, cumpliendo la función UPDATE
    @PutMapping("/updateSalida/{Id}")
    public Salida updateSalida(@PathVariable int Id, @RequestBody Salida salida){
        return salidaService.updateSalida(Id, salida);
    }

    //Este método elimina una salida de la base de datos introduciendo su DNI mediante un DELETE, cumpliendo la función del mismo nombre
    @DeleteMapping("/deleteSalida/{Id}")
    public String deleteSalida(@PathVariable int Id) {
        salidaService.deleteSalida(Id);
        return "Se ha borrado la Salida del sistema";
    }

    }

