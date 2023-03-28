package co.edu.javeriana.ingsoft.solid.refactor.logica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void sumarConZero() {
        Calculadora calculadora = new Calculadora();
        int num1 = 5;
        long resultado = calculadora.sumar(num1, 0);
        assertEquals(num1, resultado);
    }

    @Test
    void sumarLimite() {
        Calculadora calculadora = new Calculadora();
        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;

        long resultado = calculadora.sumar(num1, num2);
        assertEquals((long) (2 * Integer.MAX_VALUE), resultado);
    }

    @Test
    void restar() {
    }

    @Test
    void multiplicar() {
    }

    @Test
    void dividirPorZero() {
        Calculadora calculadora = new Calculadora();
        int num1 = 5;
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(num1, 0));
    }

    @Test
    void modulo() {
    }
}