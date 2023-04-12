package co.edu.javeriana.ingsoft.solid.refactor.logica.creacion;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.OperacionDivision;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.OperacionResta;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.OperacionSuma;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Prueba la creacion de operaciones de manera dinamica o de otra forma
 * */
class CreadorOperacionTest {

    private CreadorBase creadorOperacion = new CreadorDinamico();
    @Test
    void getOperacionSuma() {

        OperacionBinaria suma = creadorOperacion.getOperacion("Suma");
        assertInstanceOf(OperacionSuma.class, suma);
    }

    @Test
    void getOperacionResta() {

        OperacionBinaria resta = creadorOperacion.getOperacion("Resta");
        assertInstanceOf(OperacionResta.class, resta);
    }

    @Test
    void getOperacionDivision() {
        OperacionBinaria division = creadorOperacion.getOperacion("Division");
        assertInstanceOf(OperacionDivision.class, division);
    }
}