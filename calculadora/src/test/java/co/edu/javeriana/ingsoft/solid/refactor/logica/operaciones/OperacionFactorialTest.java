package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionUnaria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionFactorialTest {
    //Arreglar

    @BeforeEach
    void setUp() {
        operacionFactorial = new OperacionFactorial();
    }

    private OperacionUnaria operacionFactorial;
    @Test
    void realizarOperacionFactorialNegativo() {
        //arrange
        Integer number = -1;

        //act - assert
        assertThrows(IllegalArgumentException.class, () -> operacionFactorial.realizarOperacion(number));
    }


    @Test
    void realizarOperacionFactorialZero() {
        //arrange
        Integer number = 0;
        Long expected = 1L;
        //act
        expected = operacionFactorial.realizarOperacion(number).longValue();
        //assert
        assertEquals(1L, expected);
    }

    @Test
    void realizarOperacionFactorialUno() {
        //arrange
        Integer number = 1;
        Long expected = 1L;
        //act
        expected = operacionFactorial.realizarOperacion(number).longValue();
        //assert
        assertEquals(1L, expected);
    }

    @Test
    void realizarOperacionFactorialTres() {
        //arrange
        Integer number = 3;
        Long expected = 0L;
        //act
        expected = operacionFactorial.realizarOperacion(number).longValue();
        //assert
        assertEquals(6L, expected);
    }

    @Test
    void realizarOperacionFactorialMax() {
        //arrange
        Integer number = Integer.MAX_VALUE;
        Long expected = 0L;
        //act
        expected = operacionFactorial.realizarOperacion(number).longValue();
        //assert
        assertEquals(0L, expected);
    }
}


