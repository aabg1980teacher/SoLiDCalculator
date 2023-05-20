package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionUnaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class OperacionRaizCubicaTest {


    private OperacionUnaria operacionRaizCubica = new OperacionRaizCubica();
    @Test
    void test1Cero() {
        //arrange
        Integer number = 0;
        Double expected = 0.0;
        //act
        expected = operacionRaizCubica.realizarOperacion(number).doubleValue();
        //assert
        assertEquals(0.0, expected);
    }

    @Test
    void test2EnteroPositvo() {
        //arrange
        Integer number = 125;
        Double expected = 0.0;
        //act
        expected = operacionRaizCubica.realizarOperacion(number).doubleValue();
        //assert
        assertEquals(5.0, expected);
    }

    @Test
    void test3EnteroNegativo() {
        //arrange
        Integer number = -9261;
        Double expected = 0.0;
        //act
        expected = operacionRaizCubica.realizarOperacion(number).doubleValue();
        //assert
        assertEquals(-21.0, expected);
    }

    @Test
    void test4NoEntero() {
        //arrange
        Double number = 1815.848;
        //act
        //assert
        assertThrows(IllegalArgumentException.class, () -> operacionRaizCubica.realizarOperacion(number));
    }

    @Test
    void test5MaxInteger() {
        //arrange
        Integer number = Integer.MAX_VALUE;
        Double expected = 1290.159154892091;
        //act
        expected = operacionRaizCubica.realizarOperacion(number).doubleValue();
        //assert
        assertEquals(1290.159154892091, expected);
    }

    @Test
    void test6MinInteger() {
        //arrange
        Integer number = Integer.MIN_VALUE;
        Double expected = -1290.159154892091;
        //act
        expected = operacionRaizCubica.realizarOperacion(number).doubleValue();
        //assert
        assertEquals(-1290.1591550923501, expected);
    }

}

