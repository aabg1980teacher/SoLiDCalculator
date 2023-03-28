package co.edu.javeriana.ingsoft.solid.refactor.logica;

import co.edu.javeriana.ingsoft.solid.refactor.logica.creacion.CreadorBase;
import co.edu.javeriana.ingsoft.solid.refactor.logica.creacion.CreadorDinamico;
import co.edu.javeriana.ingsoft.solid.refactor.logica.creacion.CreadorOperacion;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinariaEntero;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinariaDecimal;


public class Calculadora {
    private OperacionBinariaEntero operacionBinariaEntero;
    private OperacionBinariaDecimal operacionBinariaDecimal;
    private CreadorBase creadorOperacion;

    public Calculadora() {
        creadorOperacion = new CreadorDinamico();
    }


    public long ejecutarOperacionBinaria(int numero1, int numero2, String operacion) {
        operacionBinariaEntero = creadorOperacion.getOperacion(operacion);
        return operacionBinariaEntero.realizarOperacion(numero1, numero2);
    }

    public double ejecutarOperacionBinariaDecimal(int a, int b, String operacion) {
        operacionBinariaDecimal = creadorOperacion.getOperacionBinariaDecimal(operacion);
        return operacionBinariaDecimal.realizarOperacion(a,b);
    }

}
