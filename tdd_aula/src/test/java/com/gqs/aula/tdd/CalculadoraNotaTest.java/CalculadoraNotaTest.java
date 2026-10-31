package com.gqs.aula.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraNotaTest {

    @Test
    void deveSomarAsTresNotas() {
        CalculadoraNota calc = new CalculadoraNota();
        double resultado = calc.calcularNotaFinal(20, 20, 30);
        assertEquals(70, resultado);
    }
    @Test
    void deveSomarOutrasNotas() {
        CalculadoraNota calc = new CalculadoraNota();
        double resultado = calc.calcularNotaFinal(10, 15, 25);
        assertEquals(50, resultado);
    }
    @Test
    void deveEstarAprovadoQuandoNotaMaiorOuIgualA60() {
        CalculadoraNota calc = new CalculadoraNota();
        boolean aprovado = calc.isAprovado(20, 20, 20);
        assertTrue(aprovado);
    }