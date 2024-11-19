package org.example;

public class Retangulo implements FormaGeometrica {

    @Override
    public double calcularArea(double base, double altura) {

        if (base == 0 || altura == 0 || altura < 0 || base < 0)
            throw new IllegalArgumentException("retangulo inexistente");

        return base * altura;
    }
}
