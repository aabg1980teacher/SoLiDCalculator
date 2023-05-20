package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionValorAbsolutoTest {

    Calculadora calculadora = new Calculadora();
    @Test
    void ejecutarAbsoluto0() {
        Number respuesta = calculadora.ejecutarunaria(0,"Absoluto");
        assertEquals(0,respuesta.longValue());
    }
    @Test
    void ejecutarAbsoluto5() {
        Number respuesta = calculadora.ejecutarunaria(5,"Absoluto");
        assertEquals(5,respuesta.longValue());
    }
    @Test
    void ejecutarAbsolutomenos5() {
        Number respuesta = calculadora.ejecutarunaria(-5,"Absoluto");
        assertEquals(5,respuesta.longValue());
    }
}