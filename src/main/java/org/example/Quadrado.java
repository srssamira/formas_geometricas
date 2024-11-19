package org.example;

public class Quadrado implements FormaGeometrica {

    @Override
    public double calcularArea(double n1, double n2) {
        if (n1 != n2)
            throw new IllegalArgumentException("os lados precisam ser iguais");

        if (n1 == 0 || n2 == 0 || n1 < 0 || n2 < 0)
            throw new IllegalArgumentException("esse quadrado nao existe");


        return n1 * n2;
    }
}
