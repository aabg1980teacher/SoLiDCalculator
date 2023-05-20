package co.edu.javeriana.ingsoft.solid.refactor.logica.creacion;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;
import calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionUnaria;

public abstract class CreadorBase {



    public abstract OperacionBinaria getOperacion(String operacion);
    public abstract OperacionUnaria getOperacionU(String operacion);
}


