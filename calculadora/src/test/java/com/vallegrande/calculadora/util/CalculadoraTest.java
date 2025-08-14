package com.vallegrande.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calc = new Calculadora();

    // ===== SUMAR =====
    @Test
    void testSumarPositivos() {
        System.out.println("Probando suma con números positivos");
        int esperado = 1750; // 950 + 800 = 1750
        int obtenido = calc.sumar(950, 800);
        System.out.println("Esperado: " + esperado + " | Obtenido: " + obtenido);
        assertEquals(esperado, obtenido);
    }

    @Test
    void testSumarNegativos() {
        System.out.println("Probando suma con números negativos");
        int esperado = -880; // -500 + (-380) = -880
        int obtenido = calc.sumar(-500, -380);
        System.out.println("Esperado: " + esperado + " | Obtenido: " + obtenido);
        assertEquals(esperado, obtenido);
    }

    // ===== RESTAR =====
    @Test
    void testRestarPositivos() {
        System.out.println("Probando resta con números positivos");
        int esperado = 150; // 950 - 800 = 150
        int obtenido = calc.restar(950, 800);
        System.out.println("Esperado: " + esperado + " | Obtenido: " + obtenido);
        assertEquals(esperado, obtenido);
    }

    @Test
    void testRestarNegativos() {
        System.out.println("Probando resta con números negativos");
        int esperado = -120; // -500 - (-380) = -120
        int obtenido = calc.restar(-500, -380);
        System.out.println("Esperado: " + esperado + " | Obtenido: " + obtenido);
        assertEquals(esperado, obtenido);
    }

    // ===== MULTIPLICAR =====
    @Test
    void testMultiplicarConCero() {
        System.out.println("Probando multiplicación con cero");
        int esperado = 0; // 444 * 0 = 0
        int obtenido = calc.multiplicar(444, 0);
        System.out.println("Esperado: " + esperado + " | Obtenido: " + obtenido);
        assertEquals(esperado, obtenido);
    }

    @Test
    void testMultiplicarPositivoNegativo() {
        System.out.println("Probando multiplicación positivo por negativo");
        int esperado = -88000; // 880 * -100 = -88000
        int obtenido = calc.multiplicar(880, -100);
        System.out.println("Esperado: " + esperado + " | Obtenido: " + obtenido);
        assertEquals(esperado, obtenido);
    }

    // ===== PORCENTAJE =====
    @Test
    void testPorcentajeNormal() {
        System.out.println("Probando cálculo de porcentaje");
        double esperado = (300.0 / 900.0) * 100; // 300 de 900 = 33.3333%
        double obtenido = calc.porcentaje(300, 900);
        System.out.println("Esperado: " + esperado + " | Obtenido: " + obtenido);
        assertEquals(esperado, obtenido, 0.0001);
    }

    @Test
    void testPorcentajeDivisionPorCero() {
        System.out.println("Probando porcentaje con total = 0 (debe lanzar excepción)");
        assertThrows(ArithmeticException.class, () -> calc.porcentaje(100, 0));
    }

    // ===== RAÍZ CUADRADA =====
    @Test
    void testRaizCuadradaNormal() {
        System.out.println("Probando raíz cuadrada de número positivo");
        double esperado = Math.sqrt(961); // raíz cuadrada de 961 = 31
        double obtenido = calc.raizCuadrada(961);
        System.out.println("Esperado: " + esperado + " | Obtenido: " + obtenido);
        assertEquals(esperado, obtenido, 0.0001);
    }

    @Test
    void testRaizCuadradaNegativo() {
        System.out.println("Probando raíz cuadrada de número negativo (debe lanzar excepción)");
        assertThrows(IllegalArgumentException.class, () -> calc.raizCuadrada(-999));
    }
}
