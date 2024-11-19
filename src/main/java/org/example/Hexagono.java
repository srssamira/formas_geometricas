package org.example;

public class Hexagono implements FormaGeometrica {

    @Override
    public double calcularArea(double base, double altura) {
        if (base != altura)
            throw new IllegalArgumentException("a base e a altura nao podem ser diferentes entre si pois esse hexagono é regular");

        if (base == 0 || altura == 0 || base < 0 || altura < 0)
            throw new IllegalArgumentException("esse hexagono nao existe, os valores dos lados nao podem ser negativos ou nulos");

        return ((((base * altura) * Math.sqrt(3))) * 6) / 4;
    }
}
