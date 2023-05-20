package co.edu.javeriana.ingsoft.solid.refactor.logica;

import co.edu.javeriana.ingsoft.solid.refactor.logica.creacion.CreadorBase;
import co.edu.javeriana.ingsoft.solid.refactor.logica.creacion.CreadorDinamico;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;
import calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionUnaria;


public class Calculadora {
    private OperacionBinaria operacionBinaria;
    private OperacionUnaria operacionUnaria;

    private CreadorBase creadorOperacion;

    public Calculadora() {
        creadorOperacion = new CreadorDinamico();
    }


    public Number ejecutarOperacion(Number numero1, Number numero2, String operacion) {

        operacionBinaria = creadorOperacion.getOperacion(operacion);
        return operacionBinaria.realizarOperacion(numero1, numero2);
    }
    public Number ejecutarunaria(Number numero1,String operacion)
    {
        operacionUnaria=creadorOperacion.getOperacionU(operacion);
        return operacionUnaria.realizarOperacion(numero1);
    }

}
