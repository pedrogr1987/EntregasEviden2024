package com.proyecto.ClubNautico.Entity;

/*Autor: Pedro Garcia Rodríguez
 * Título: Clase Patron
 * Propósito: Identificar la relación entre la clase, sus atributos y las columnas de la tabla correspondiente
 * en la base de datos
 * Fecha: 2024/06/05
 * */
import java.io.Serializable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
//Aquí se identifica la tabla con la que se relaciona la clase
@Table(name = "patron")
public class Patron implements Serializable{

    //@Id identifica la Primary Key de la tabla
    @Id
    @Column(name = "DNI")
    private String dni;
    @Basic
    private String nombre;
    @Basic
    private String apellidos;
    }
