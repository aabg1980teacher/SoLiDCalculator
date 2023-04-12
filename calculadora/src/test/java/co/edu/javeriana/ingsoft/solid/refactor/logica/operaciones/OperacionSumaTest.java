package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionSumaTest {

    @Test
    void sumar() {
        OperacionSuma sumador = new OperacionSuma();
        long resultado = (Long) sumador.realizarOperacion(Integer.MAX_VALUE, Integer.MAX_VALUE);
        Long expected = Long.valueOf(Integer.MAX_VALUE )*2;
        assertEquals(expected, resultado);
    }
}