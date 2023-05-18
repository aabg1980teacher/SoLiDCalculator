package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OperacionNumeroMayorTest {

    @Test
    void numeroMayorIguales() {

        Integer number1 = 5;
        Integer number2 = 5;

        OperacionNumeroMayor operacionNumeroMayor = new OperacionNumeroMayor();
        assertThrows(IllegalArgumentException.class, () -> operacionNumeroMayor.realizarOperacion(number1,number2));
    }
    @Test
    void numeroMayorUnoArribaDelRango(){

        OperacionNumeroMayor operacionNumeroMayor = new OperacionNumeroMayor();

        Number number1 = 18;
        Number number2 = Integer.MAX_VALUE+1;

        assertThrows(IllegalArgumentException.class, () -> operacionNumeroMayor.realizarOperacion(number1,number2));
    }
    @Test
    void numeroMayorUnoDebajoDelRango(){

        OperacionNumeroMayor operacionNumeroMayor = new OperacionNumeroMayor();

        Number number1 = Integer.MIN_VALUE-1;
        Number number2 = -8;

        assertThrows(IllegalArgumentException.class, () -> operacionNumeroMayor.realizarOperacion(number1,number2));
    }
    @Test
    void numeroMayorAmbosFueraRango(){

        OperacionNumeroMayor operacionNumeroMayor = new OperacionNumeroMayor();

        Number number1 = Integer.MIN_VALUE-1;
        Number number2 = Integer.MAX_VALUE+1;

        assertThrows(IllegalArgumentException.class, () -> operacionNumeroMayor.realizarOperacion(number1,number2));
    }
    @Test
    void numeroMayorAmbosDentroRango(){

        OperacionNumeroMayor operacionNumeroMayor = new OperacionNumeroMayor();

        Number number1 = -19;
        Number number2 = 18;

        Integer resultado = (Integer) operacionNumeroMayor.realizarOperacion(number1,number2);
        assertEquals(18, resultado);
    }
}
