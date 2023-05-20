package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionUnaria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OperacionRaizCuadradaTest {

    @BeforeEach
    void setUp(){  //iniciarlizar las variables que necesite
        operacionRaizCuadrada = new OperacionRaizCuadrada();
    }
    private OperacionUnaria operacionRaizCuadrada;

    @Test
    void realizarOperacionRaizCuadradaNegativa() {
        //arrange
        double number = -1;

        //ACT- assert
        assertThrows(IllegalArgumentException.class, ()-> operacionRaizCuadrada.realizarOperacion(-1));
    }
    @Test
    void realizarOperacionRaizCuadradaZero(){
        //arrange
        Integer number = 0;
        Long expected = 0L;

        //act
        expected = operacionRaizCuadrada.realizarOperacion(number).longValue();
        //assert
        assertEquals(0L, expected);
    }
    @Test
    void  realizarOperacionRaizCuadradaUno(){
        //arrange
        Integer number =1 ;//entrada
        Long expected = 1L;//salida
        //act
        expected = operacionRaizCuadrada.realizarOperacion(number).longValue();
        //assert
        assertEquals(1L, expected);

    }

    @Test
    void realizarOperacionRaizCuadradaTres() {  //LIMITE INFERIOR
        //arrange
        double number = 3;
        double expected = 0; //valor esperado de la raiz cuadrada de 3
        //act
        double result = (double) operacionRaizCuadrada.realizarOperacion(number);
        //assert
        assertEquals(1.732, result, 0.001);
    }

    @Test
    void realizarOperacionRaizCuadradaDieciseis() { //CON UN NÚMERO MENOR AL LIMITE SUPERIOR
        //arrange
        double number = 16;
        double expected = 0; //valor esperado de la raiz cuadrada de 16
        //act
        double result = (double) operacionRaizCuadrada.realizarOperacion(number);
        //assert
        assertEquals(4, result, 0.001);
    }

    @Test
    void realizarOperacionRaizCuadradaLim() { //LIMITE SUPERIOR
        //arrange
        double number = 1.7976931348623157e+308;

        //ACT- assert
        assertThrows(IllegalArgumentException.class, ()-> operacionRaizCuadrada.realizarOperacion(-1));
    }
    @Test
    void realizarOperacionRaizCuadradaMax() { //CON UN NÚMERO MAYOR AL LIMITE SUPERIOR
        //arrange
        double number = Double.MAX_VALUE;

        //assert
        assertThrows(IllegalArgumentException.class, ()-> operacionRaizCuadrada.realizarOperacion(-1));
    }

    @Test
    void realizarOperacionRaizCuadradaDecimal(){
        //arrange
        double number = 2.25;
        double expected = 0; //valor esperado de la raiz cuadrada de 2.25
        //act
        double result = (double) operacionRaizCuadrada.realizarOperacion(number);
        //assert
        assertEquals(1.5,result,0.001);
    }


}