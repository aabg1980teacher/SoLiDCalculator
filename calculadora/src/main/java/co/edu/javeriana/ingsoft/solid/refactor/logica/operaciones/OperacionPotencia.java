package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinariaEntero;

public class OperacionPotencia implements OperacionBinariaEntero {
    private long potenciar(int a, int b) {
        return (long) Math.pow(a,b);
    }

    @Override
    public long realizarOperacion(int a, int b) {
        return potenciar(a,b);
    }
}
