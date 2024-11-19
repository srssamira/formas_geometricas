package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCirculo {

    @Test
    public void testCirculoSeAreaEstiverCorreta() {
        FormaGeometrica formaGeometrica = new Circulo();

        double resultado = formaGeometrica.calcularArea(2, 4);

        Assertions.assertEquals(12.566370614359172, resultado);
    }

    @Test
    public void testCirculoSeRaioForDiferenteDaMetadeDoDiametro(){

        FormaGeometrica formaGeometrica = new Circulo();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            formaGeometrica.calcularArea(2, 8);
        });
    }

    @Test
    public void testCirculoSeRaioForNegativoOuIgualAZero(){

        FormaGeometrica formaGeometrica = new Circulo();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            formaGeometrica.calcularArea(0, 0);
        });
    }
}
