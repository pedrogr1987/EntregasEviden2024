package com.proyecto.ClubNautico.Controller;

/*Autor: Pedro Garcia Rodríguez
 * Título: BarcoController
 * Propósito: Clase donde se crean los endpoints invocando a los métodos desarrollados en capas inferiores
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Barco;
import com.proyecto.ClubNautico.Services.BarcoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BarcoController {
    @Autowired
    BarcoService barcoService;

    //Este método nos devuelve todos los barcos mediante un GET, cumpliendo la función READ
    @GetMapping("/findAllBarcos")
    public List<Barco> findAllBarcos(){
        return barcoService.findAllBarcos();
    }

    //Este método guarda un barco creado, mediante un método POST, cumpliendo la función CREATE
    @PostMapping("/saveBarco")
    public Barco saveBarco(@RequestBody Barco barco) {
        return barcoService.saveBarco(barco);
    }

    //Este método actualiza el barco al cual accedemos mediante su matrícula mediante un PUT, cumpliendo la función UPDATE
    @PutMapping("/updateBarco/{Matricula}")
    public Barco updateBarco(@PathVariable String Matricula, @RequestBody Barco barco){
        return barcoService.updateBarco(Matricula, barco);
    }

    //Este método elimina un barco de la base de datos introduciendo su matrícula mediante un DELETE, cumpliendo la función del mismo nombre
    @DeleteMapping("/deleteBarco/{Matricula}")
    public String deleteBarco(@PathVariable String Matricula) {
        barcoService.deleteBarco(Matricula);
        return "Se ha borrado el barco del sistema";
    }

    }

