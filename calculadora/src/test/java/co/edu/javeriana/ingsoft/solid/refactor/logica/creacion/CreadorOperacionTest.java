package co.edu.javeriana.ingsoft.solid.refactor.logica.creacion;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.OperacionDivision;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.OperacionResta;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.OperacionSuma;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinariaDecimal;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinariaEntero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Prueba la creacion de operaciones de manera dinamica o de otra forma
 * */
class CreadorOperacionTest {

    private CreadorBase creadorOperacion = new CreadorDinamico();
    @Test
    void getOperacionSuma() {

        OperacionBinariaEntero suma = creadorOperacion.getOperacion("Suma");
        assertInstanceOf(OperacionSuma.class, suma);
    }

    @Test
    void getOperacionResta() {

        OperacionBinariaEntero resta = creadorOperacion.getOperacion("Resta");
        assertInstanceOf(OperacionResta.class, resta);
    }

    @Test
    void getOperacionDivision() {
        OperacionBinariaDecimal division = creadorOperacion.getOperacionBinariaDecimal("Division");
        assertInstanceOf(OperacionDivision.class, division);
    }
}