package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionUnaria;

public class OperacionLogaritmo implements OperacionUnaria {

    private Number LogaritmoBase2(Number num1) {

        if(num1.intValue() < 0)
            throw new IllegalArgumentException("El número no puede ser negativo");
        else if(num1.intValue() == 0)
            throw new IllegalArgumentException("El número no puede ser 0");
        else if(num1.doubleValue() > Integer.MAX_VALUE)
            throw new IllegalArgumentException("El número no es valido");

        return Math.log(num1.doubleValue()) / Math.log(2);
    }

    @Override
    public Number realizarOperacion(Number num1) {
        return LogaritmoBase2(num1);
    }
}
