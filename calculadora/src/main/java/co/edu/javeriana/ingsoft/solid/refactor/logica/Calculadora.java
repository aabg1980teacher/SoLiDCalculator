package co.edu.javeriana.ingsoft.solid.refactor.logica;

import co.edu.javeriana.ingsoft.solid.refactor.logica.creacion.CreadorBase;
import co.edu.javeriana.ingsoft.solid.refactor.logica.creacion.CreadorDinamico;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;


public class Calculadora {
    private OperacionBinaria operacionBinaria;

    private CreadorBase creadorOperacion;

    public Calculadora() {
        creadorOperacion = new CreadorDinamico();
    }


    public Number ejecutarOperacion(Number numero1, Number numero2, String operacion) {

        operacionBinaria = creadorOperacion.getOperacion(operacion);
        return operacionBinaria.realizarOperacion(numero1, numero2);
    }

}
