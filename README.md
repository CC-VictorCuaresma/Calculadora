# 🧮 Calculadora

Proyecto desarrollado en **Java** usando **Spring Boot** y **JUnit 5** que implementa una calculadora con operaciones básicas, expuestas mediante una API REST y validadas con pruebas unitarias.

---

## 🚀 Tecnologías utilizadas

- **Java 17** o superior
- **Spring Boot 3.x**
- **Spring Web** (para exponer endpoints REST)
- **JUnit 5** (para pruebas unitarias)
- **Maven** (para gestión de dependencias y build)

---

## 🧮 Funcionalidades disponibles

La calculadora cuenta con las siguientes operaciones:

1. **Suma** → `sumar(a, b)`
2. **Resta** → `restar(a, b)`
3. **Multiplicación** → `multiplicar(a, b)`
4. **Porcentaje** → `porcentaje(valor, total)`  
   _(Lanza excepción si `total` es 0)_
5. **Raíz cuadrada** → `raizCuadrada(valor)`  
   _(Lanza excepción si el número es negativo)_

---

## 🌐 Endpoints REST

La API expone los siguientes endpoints:

| Método | Endpoint         | Parámetros                        | Ejemplo de uso |
|--------|------------------|------------------------------------|----------------|
| GET    | `/sumar`         | `a` (int), `b` (int)               | `/sumar?a=10&b=5` |
| GET    | `/restar`        | `a` (int), `b` (int)               | `/restar?a=20&b=8` |
| GET    | `/multiplicar`   | `a` (int), `b` (int)               | `/multiplicar?a=4&b=5` |
| GET    | `/porcentaje`    | `valor` (double), `total` (double) | `/porcentaje?valor=50&total=200` |
| GET    | `/raiz`          | `valor` (double)                   | `/raiz?valor=25` |

📌 **Ejemplo de respuesta JSON**:
```json
{
  "resultado": 15
}
