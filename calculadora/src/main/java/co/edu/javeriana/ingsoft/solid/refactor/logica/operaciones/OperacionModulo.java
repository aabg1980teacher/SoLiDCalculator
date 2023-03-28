package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinariaEntero;

public class OperacionModulo implements OperacionBinariaEntero {

    private long modular(int num1, int num2) {
        return num1 % num2;
    }

    @Override
    public long realizarOperacion(int a, int b) {
        return modular(a,b);
    }
}
