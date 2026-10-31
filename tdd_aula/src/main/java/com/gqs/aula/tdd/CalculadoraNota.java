package com.gqs.aula.tdd;

public class CalculadoraNota {

    public double calcularNotaFinal(double a1, double a2, double a3) {
        return a1 + a2 + a3;
    }

    public boolean isAprovado(double a1, double a2, double a3) {
        return calcularNotaFinal(a1, a2, a3) >= 60;
    }
}