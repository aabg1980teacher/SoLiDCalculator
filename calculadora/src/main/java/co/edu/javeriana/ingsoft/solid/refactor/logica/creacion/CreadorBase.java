package co.edu.javeriana.ingsoft.solid.refactor.logica.creacion;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinariaEntero;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinariaDecimal;

public abstract class CreadorBase {

    public abstract OperacionBinariaEntero getOperacion(String operacion);

    public abstract OperacionBinariaDecimal getOperacionBinariaDecimal(String operacion);
}


