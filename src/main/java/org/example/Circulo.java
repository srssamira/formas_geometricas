package org.example;

public class Circulo implements FormaGeometrica {

    @Override
    public double calcularArea(double raio, double diametro) {

        if (raio != diametro / 2)
            throw new IllegalArgumentException("raio tem que ser igual à metade do diametro");

        if (raio < 0 || raio == 0)
            throw new IllegalArgumentException("circulo inexistente");

        return Math.PI * Math.pow(raio, 2);
    }
}
