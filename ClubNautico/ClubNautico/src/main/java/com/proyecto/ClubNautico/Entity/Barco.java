package com.proyecto.ClubNautico.Entity;
/*Autor: Pedro Garcia Rodríguez
* Título: Clase Barco
* Propósito: Identificar la relación entre la clase, sus atributos y las columnas de la tabla correspondiente
* en la base de datos
* Fecha: 2024/06/05
* */

import jakarta.persistence.*;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//Aquí se identifica la tabla con la que se relaciona la clase
@Table(name = "barco",
uniqueConstraints =@UniqueConstraint(
        name ="matricula_unique",
        columnNames = "Matricula")
        )
public class Barco {
    //@Id identifica la Primary Key de la tabla
    @Id
    @Column(name = "Matricula")
    private String matricula;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Numamarre")
    private Integer numamarre;
    @Column(name = "Cuota")
    private Float cuota;
    /*Esto lo puse al principio pero al hacer la consulta, como también tengo en salida los barcos sale uno dentro del
    * otro formando un bucle infinito, así que decidí quitarlo*/
   /* @OneToOne(mappedBy = "barco",cascade = CascadeType.ALL)
    private Salida salida;*/
    @Column(name = "socio")
    private String socio;
}
