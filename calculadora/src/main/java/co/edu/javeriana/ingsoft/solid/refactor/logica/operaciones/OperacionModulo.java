package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;

public class OperacionModulo implements OperacionBinaria {

    private Number modular(Number num1, Number num2) {
        return num1.longValue() % num2.longValue();
    }

    @Override
    public Number realizarOperacion(Number a, Number b) {
        return modular(a,b);
    }
}
