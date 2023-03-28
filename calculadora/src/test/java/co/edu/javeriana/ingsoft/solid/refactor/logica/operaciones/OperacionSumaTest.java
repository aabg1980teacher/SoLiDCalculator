package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionSumaTest {

    @Test
    void sumar() {
        OperacionSuma sumador = new OperacionSuma();
        long resultado = sumador.realizarOperacion(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals((2 * Integer.MAX_VALUE), resultado);
    }
}