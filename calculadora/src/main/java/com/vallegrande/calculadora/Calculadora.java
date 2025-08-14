package com.vallegrande.calculadora;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double porcentaje(int parte, int total) {
        if (total == 0) {
            throw new ArithmeticException("No se puede dividir por cero en porcentaje");
        }
        return (parte * 100.0) / total;
    }

    public double raizCuadrada(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("No se puede calcular raíz cuadrada de un número negativo");
        }
        return Math.sqrt(x);
    }
}
