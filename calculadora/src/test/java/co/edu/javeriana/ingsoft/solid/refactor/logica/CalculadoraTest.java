package co.edu.javeriana.ingsoft.solid.refactor.logica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();
    @Test
    void ejecutarOperacionEntera() {
        Number respuesta = calculadora.ejecutarOperacion(5,7,"Suma");
        assertInstanceOf(Long.class, respuesta);
    }

    @Test
    void ejecutarOperacionDecimal() {
        Number respuesta = calculadora.ejecutarOperacion(5,2,"Division");
        assertInstanceOf(Double.class,respuesta);
    }
}