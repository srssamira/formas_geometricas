package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestQuadrado {

    @Test
    public void testQuadradoSeOsLadosForemDiferentesEntreSi() {
        FormaGeometrica formaGeometrica = new Quadrado();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            formaGeometrica.calcularArea(5, 2);
        });

    }

    @Test
    public void testQuadradoVerificarSeAreaEstaCorreta() {
        FormaGeometrica formaGeometrica = new Quadrado();

        double resultado = formaGeometrica.calcularArea(5, 5);

        Assertions.assertEquals(25, resultado);
    }

    @Test
    public void testQuadradoSeUmDosLadosForIgualAZeroOuMenorQueZero() {
        FormaGeometrica formaGeometrica = new Quadrado();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            formaGeometrica.calcularArea(0, 0);
        });
    }
}
