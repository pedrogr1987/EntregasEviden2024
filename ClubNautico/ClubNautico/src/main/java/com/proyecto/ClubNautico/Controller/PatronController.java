package com.proyecto.ClubNautico.Controller;

/*Autor: Pedro Garcia Rodríguez
 * Título: PatronController
 * Propósito: Clase donde se crean los endpoints invocando a los métodos desarrollados en capas inferiores
 * Fecha: 2024/06/05
 * */

import com.proyecto.ClubNautico.Entity.Patron;
import com.proyecto.ClubNautico.Services.PatronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PatronController {
    @Autowired
    PatronService patronService;

    //Este método nos devuelve todos los patrones mediante un GET, cumpliendo la función READ
    @GetMapping("/findAllPatrones")
    public List<Patron> findAllBarcos(){
        return patronService.findAllPatrones();
    }

    //Este método guarda un patron creado, mediante un método POST, cumpliendo la función CREATE
    @PostMapping("/savePatron")
    public Patron savePatron(@RequestBody Patron patron) {
        return patronService.savePatron(patron);
    }

    //Este método actualiza el patron al cual accedemos mediante su DNI mediante un PUT, cumpliendo la función UPDATE
    @PutMapping("/updatePatron/{Dni}")
    public Patron updatePatron(@PathVariable String Dni, @RequestBody Patron patron){
        return patronService.updatePatron(Dni, patron);
    }

    //Este método elimina un patron de la base de datos introduciendo su DNI mediante un DELETE, cumpliendo la función del mismo nombre
    @DeleteMapping("/deletePatrondeletePatron/{Dni}")
    public String deletePatron(@PathVariable String Dni) {
        patronService.deletePatron(Dni);
        return "Se ha borrado el patron del sistema";
    }

    }

