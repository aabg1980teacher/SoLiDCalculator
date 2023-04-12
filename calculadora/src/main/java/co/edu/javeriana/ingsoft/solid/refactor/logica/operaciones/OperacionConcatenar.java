package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;

public class OperacionConcatenar implements OperacionBinaria {

    private long concatenar(Number a, Number b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);
        return Long.parseLong(sb.toString());
    }

    @Override
    public Number realizarOperacion(Number a, Number b) {
        return concatenar(a,b);
    }

}
