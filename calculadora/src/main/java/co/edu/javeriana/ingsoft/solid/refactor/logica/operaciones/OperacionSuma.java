package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinariaEntero;

public class OperacionSuma implements OperacionBinariaEntero {
    private long sumar(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public long realizarOperacion(int a, int b) {
        return sumar(a,b);
    }
}
