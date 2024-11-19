package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHexagono {

    @Test
    public void testHexagonoSeAreaEstiverCorreta() {
        FormaGeometrica formaGeometrica = new Hexagono();

        double resultado = formaGeometrica.calcularArea(5, 5);

        Assertions.assertEquals(64.9519052838329, resultado);
    }

    @Test
    public void testHexagonoSeUmDosLadosForemDiferentesEntreSi() {
        FormaGeometrica formaGeometrica = new Hexagono();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            formaGeometrica.calcularArea(5, 10);
        });
    }

    @Test
    public void testHexagonoSeOsLadosForemIguaisOuMenoresQueZero(){
        FormaGeometrica formaGeometrica = new Hexagono();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            formaGeometrica.calcularArea(5, 0);
        });
    }

}
