package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRetangulo {

    @Test
    public void testRetanguloSeAreaEstiverCorreta(){
        FormaGeometrica formaGeometrica = new Retangulo();

        double resultado = formaGeometrica.calcularArea(5, 6);

        Assertions.assertEquals(30, resultado);
    }

    @Test
    public void testRetanguloSeUmDosLadosForNegativoOuIgualAZero(){
        FormaGeometrica formaGeometrica = new Retangulo();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            formaGeometrica.calcularArea(-5, 0);
        });
    }

}
