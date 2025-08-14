package com.vallegrande.calculadora.controller;

import com.vallegrande.calculadora.Calculadora;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    private final Calculadora calculadora = new Calculadora();

    @GetMapping("/restar")
    public int restar(@RequestParam int a, @RequestParam int b) {
        return calculadora.restar(a, b);
    }

    @GetMapping("/multiplicar")
    public int multiplicar(@RequestParam int a, @RequestParam int b) {
        return calculadora.multiplicar(a, b);
    }

    @GetMapping("/porcentaje")
    public double porcentaje(@RequestParam int parte, @RequestParam int total) {
        return calculadora.porcentaje(parte, total);
    }

    @GetMapping("/raiz-cuadrada")
    public double raizCuadrada(@RequestParam double x) {
        return calculadora.raizCuadrada(x);
    }
}
