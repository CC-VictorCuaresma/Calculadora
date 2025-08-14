package com.vallegrande.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calc = new Calculadora();

    // ===== RESTAR =====
    @Test
    void testRestarPositivos() {
        System.out.println("Probando resta con números positivos");
        int esperado = 18; // 56 - 38 = 18
        int obtenido = calc.restar(56, 38);
        System.out.println("Esperado: " + esperado + " | Obtenido: " + obtenido);
        assertEquals(esperado, obtenido);
    }

    @Test
    void testRestarNegativos() {
        System.out.println("Probando resta con números negativos");
        int esperado = -18; // -38 - (-20) = -18
        int obtenido = calc.restar(-38, -20);
        System.out.println("Esperado: " + esperado + " | Obtenido: " + obtenido);
        assertEquals(esperado, obtenido);
    }

    // ===== MULTIPLICAR =====
    @Test
    void testMultiplicarConCero() {
        System.out.println("Probando multiplicación con cero");
        int esperado = 0; // 44 * 0 = 0
        int obtenido = calc.multiplicar(44, 0);
        System.out.println("Esperado: " + esperado + " | Obtenido: " + obtenido);
        assertEquals(esperado, obtenido);
    }

    @Test
    void testMultiplicarPositivoNegativo() {
        System.out.println("Probando multiplicación positivo por negativo");
        int esperado = -880; // 44 * -20 = -880
        int obtenido = calc.multiplicar(44, -20);
        System.out.println("Esperado: " + esperado + " | Obtenido: " + obtenido);
        assertEquals(esperado, obtenido);
    }

    // ===== PORCENTAJE =====
    @Test
    void testPorcentajeNormal() {
        System.out.println("Probando cálculo de porcentaje");
        double esperado = 35.7143; // (20 de 56) = 35.7143%
        double obtenido = calc.porcentaje(20, 56);
        System.out.println("Esperado: " + esperado + " | Obtenido: " + obtenido);
        assertEquals(esperado, obtenido, 0.0001);
    }

    @Test
    void testPorcentajeDivisionPorCero() {
        System.out.println("Probando porcentaje con total = 0 (debe lanzar excepción)");
        assertThrows(ArithmeticException.class, () -> calc.porcentaje(10, 0));
    }

    // ===== RAÍZ CUADRADA =====
    @Test
    void testRaizCuadradaNormal() {
        System.out.println("Probando raíz cuadrada de número positivo");
        double esperado = Math.sqrt(38); // raíz cuadrada de 38
        double obtenido = calc.raizCuadrada(38);
        System.out.println("Esperado: " + esperado + " | Obtenido: " + obtenido);
        assertEquals(esperado, obtenido, 0.0001);
    }

    @Test
    void testRaizCuadradaNegativo() {
        System.out.println("Probando raíz cuadrada de número negativo (debe lanzar excepción)");
        assertThrows(IllegalArgumentException.class, () -> calc.raizCuadrada(-44));
    }
}
