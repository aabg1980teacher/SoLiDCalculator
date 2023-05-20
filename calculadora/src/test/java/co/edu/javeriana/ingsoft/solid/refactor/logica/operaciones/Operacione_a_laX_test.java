package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionUnaria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class Operacione_a_laX_test {
    //Arreglar

    @BeforeEach
    void setUp() {
        operacione_a_laX = new Operacione_a_laX();
    }

    private OperacionUnaria operacione_a_laX;


    @Test
    public void numeroMuyGrande() {
        Double numGrande = Double.MAX_VALUE;
        //Cuando se eleva a un número extremadamente grande, tiende al infinito
        Assertions.assertEquals(Math.exp(numGrande), Double.POSITIVE_INFINITY, 0.0001);

    }

    @Test
    public void numeroMuyPeque() {
        Double numPeque = -Double.MAX_VALUE;
        //Cuando se eleva a un número extremadamente grande negativo, tiende a 0
        Assertions.assertEquals(Math.exp(numPeque),0, 0.0001);
    }

    @Test
    public void testElevarAUnPostitivo() {
        // Prueba con un número positivo
        Number resultadoPositivo = operacione_a_laX.realizarOperacion(2);
        Assertions.assertEquals(Math.exp(2), resultadoPositivo.doubleValue(), 0.0001,
                "El resultado de e^x es incorrecto para x = 2");
    }

    @Test
    void realizarOperacionElevaralaZero() {
        //arrange
        Integer number = 0;
        Long expected = 1L;
        //act
        expected = operacione_a_laX.realizarOperacion(number).longValue();
        //assert
        assertEquals(1L, expected);
    }

    @Test
    void realizarOperacioneelevadoalaUno() {
        //arrange
        Integer number = 1;
        double expected = 2.718281d;
        //act
        double result = operacione_a_laX.realizarOperacion(number).doubleValue();
        //assert
        assertEquals(expected, result, 0.0001, "El resultado de e^1 es incorrecto");
    }

    @Test
    void realizarOperacioneelevadoalaTres() {
        //arrange
        Integer number = 3;
        double expected = 20.0855369d;
        //act
        double result = operacione_a_laX.realizarOperacion(number).doubleValue();
        //assert
        assertEquals(expected, result, 0.0001, "El resultado de e^3 es incorrecto");
    }

    @Test
    public void realizarOperacionExponenteNegativo() {
        //arrange
        Number resultadoNegativo = operacione_a_laX.realizarOperacion(-1);
        Assertions.assertEquals(1 / Math.exp(1), resultadoNegativo.doubleValue(), 0.0001, "El resultado de e^-1 es incorrecto");
    }

    @Test
    public void realizarOperacionNumeroDecimal() {
        //arrange
        double number = 3.34;
        double expected = 28.21912670540861d;
        //act
        double result = operacione_a_laX.realizarOperacion(number).doubleValue();
        //assert
        assertEquals(expected, result, 0.0001, "El resultado de e^3.34 es incorrecto");
    }
}
