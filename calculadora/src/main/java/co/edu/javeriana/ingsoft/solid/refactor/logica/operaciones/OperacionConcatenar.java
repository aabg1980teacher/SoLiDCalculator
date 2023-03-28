package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinariaEntero;

public class OperacionConcatenar implements OperacionBinariaEntero {

    private long concatenar(int a, int b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);
        return Long.parseLong(sb.toString());
    }

    @Override
    public long realizarOperacion(int a, int b) {
        return concatenar(a,b);
    }
}
