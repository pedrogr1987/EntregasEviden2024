/*package com.proyecto.ClubNautico.Repository;

//Esta es una clase test para probar los métodos antes de hacer las clases controller

import com.proyecto.ClubNautico.Entity.Barco;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BarcoRepositoryTest {
    @Autowired
    BarcoRepository barcoRepository;

    @Test
    public void saveBarco() {
        Barco barco = Barco.builder()
                .matricula("1654DRS")
                .nombre("El Gambón rojo")
                .numamarre(143)
                .cuota(226.4F).build();
        barcoRepository.save(barco);
    }
@Test
    public void findBarcoByMatricula() {

    Barco barco = barcoRepository.findByMatricula("1654DRS").get();
    System.out.println("Barco " + barco);
}
@Test
public void findAllBarcos(){
        List<Barco> barcoList = barcoRepository.findAll();
}
}*/