package com.proyecto.ClubNautico.Entity;

/*Autor: Pedro Garcia Rodríguez
 * Título: Clase Socio
 * Propósito: Identificar la relación entre la clase, sus atributos y las columnas de la tabla correspondiente
 * en la base de datos
 * Fecha: 2024/06/05
 * */
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
//Aquí se identifica la tabla con la que se relaciona la clase
@Table(name = "socio")
public class Socio {
    //@Id identifica la Primary Key de la tabla
    @Id
    @Column(name = "id")
    private String Id;
    //Aquí se crea la relación entre la columna patrón y la clase a través de la columna dni
    @OneToOne
    @JoinColumn(name ="DNI", referencedColumnName = "dni")
    private Patron datos;

    //Aquí se crea la relación One to Many (uno a muchos) entre la columna patrón y la clase barco,
    // creando un ArrayList de entidades Barco
    @OneToMany
    (mappedBy="socio", cascade = CascadeType.ALL, fetch =
            FetchType.EAGER,
            orphanRemoval = true)
    private List<Barco> barcos;
}
