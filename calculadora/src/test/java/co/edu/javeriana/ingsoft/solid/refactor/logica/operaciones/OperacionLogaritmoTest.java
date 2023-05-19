package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionUnaria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperacionLogaritmoTest {

    @BeforeEach
    void setUp() {
        operacionLogaritmo = new OperacionLogaritmo();
    }

    private OperacionUnaria operacionLogaritmo;

    @Test
    public void Logaritmobase2Negativo() {
        // Rango
        Integer number = -1;

        // Valor esperado error
        assertThrows(IllegalArgumentException.class, () -> operacionLogaritmo.realizarOperacion(number));
    }

    @Test
    public void Logaritmobase2Zero(){
        // Rango
        Integer number = 0;

        // Valor esperado error
        assertThrows(IllegalArgumentException.class, () -> operacionLogaritmo.realizarOperacion(number));
    }

    @Test
    public void Logaritmobase2Uno(){

        // Rango
        Integer number = 1;
        Double expected = 0.0;

        // Valor esperado
        expected = operacionLogaritmo.realizarOperacion(number).doubleValue();

        // Comprobar
        assertEquals(0.0, expected);
    }

    @Test
    void Logaritmobase2Dos() {
        // Rango
        Integer number = 2;
        Double expected = 1.0;

        // Valor esperado
        expected = operacionLogaritmo.realizarOperacion(number).doubleValue();

        // Comprobar
        assertEquals(1.0, expected);
    }

    @Test
    void Logaritmobase2EnteroPositivo() {
        // Rango
        Integer number = 27;
        Double expected = 4.754887502163469;

        // Valor esperado
        expected = operacionLogaritmo.realizarOperacion(number).doubleValue();

        // Comprobar
        assertEquals(4.754887502163469, expected);
    }

    @Test
    void Logaritmobase2Max() {
        // Rango
        Double number = Double.MAX_VALUE;

        // Valor esperado error
        assertThrows(IllegalArgumentException.class, () -> operacionLogaritmo.realizarOperacion(number));
    }

}