package com.proyecto.ClubNautico.Entity;

/*Autor: Pedro Garcia Rodríguez
 * Título: Clase Salida
 * Propósito: Identificar la relación entre la clase, sus atributos y las columnas de la tabla correspondiente
 * en la base de datos
 * Fecha: 2024/06/05
 * */
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
//Aquí se identifica la tabla con la que se relaciona la clase
@Table(name = "salida")

public class Salida {
    //@Id identifica la Primary Key de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private int id;
    @Column(name = "Fecha")
    private String fecha;
    @Column(name = "Hora")
    private String hora;
    @Column(name = "Destino")
    private String destino;
    //Aquí se crea la relación entre la columna patrón y la clase a través de la columna dni
    @OneToOne
    @JoinColumn(name ="Patron", referencedColumnName = "dni")
    private Patron patron;
    //Aquí se crea la relación entre la columna barco y la clase a través de la columna matricula
    @OneToOne
    @JoinColumn(name ="Barco", referencedColumnName = "Matricula")
    private Barco barco;

}
