package org.example;

public class Triangulo implements FormaGeometrica {

    @Override
    public double calcularArea(double base, double altura) {

        if (altura < 0 || base < 0)
            throw new IllegalArgumentException("nao existe area para triangulo com base e/ou altura negativas");

        if (altura == 0 || base == 0)
            throw new IllegalArgumentException("esse triangulo nao existe");

        return (base * altura)/2;
    }
}
