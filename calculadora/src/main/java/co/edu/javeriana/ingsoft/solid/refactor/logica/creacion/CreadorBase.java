package co.edu.javeriana.ingsoft.solid.refactor.logica.creacion;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionUnaria;

public abstract class CreadorBase {

    public abstract OperacionBinaria getOperacion(String operacion);

    public abstract OperacionUnaria getOperacionUnaria(String operacion);
}


