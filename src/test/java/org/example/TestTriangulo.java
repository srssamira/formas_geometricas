package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTriangulo {

    @Test
    public void testTrianguloSeAreaEstiverCorreta() {
        FormaGeometrica formaGeometrica = new Triangulo();

        double resultado = formaGeometrica.calcularArea(5, 3);

        Assertions.assertEquals(7.5, resultado);
    }

    @Test
    public void testTrianguloSeBaseOuAlturaForemNegativas() {
        FormaGeometrica formaGeometrica = new Triangulo();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            formaGeometrica.calcularArea(-5, 3);
        });
    }

    @Test
    public void testTrianguloSeBaseOuAlturaForemIguaisAZero() {
        FormaGeometrica formaGeometrica = new Triangulo();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            formaGeometrica.calcularArea(5, 0);
        });
    }
}
