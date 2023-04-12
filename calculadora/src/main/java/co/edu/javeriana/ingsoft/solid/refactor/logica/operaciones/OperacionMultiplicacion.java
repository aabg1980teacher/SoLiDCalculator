package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;

public class OperacionMultiplicacion implements OperacionBinaria {
    private Number multiplicar(Number num1, Number num2) {
        return num1.longValue() * num2.longValue();
    }

    @Override
    public Number realizarOperacion(Number a, Number b) {
        return multiplicar(a,b);
    }
}
