package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;

public class OperacionSuma implements OperacionBinaria {
    private Number sumar(Number num1, Number num2) {
        return num1.longValue() + num2.longValue();
    }



    @Override
    public Number realizarOperacion(Number num1, Number num2) {
        return sumar(num1, num2);
    }
}
