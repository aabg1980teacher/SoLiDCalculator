package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;

public class OperacionDivision implements OperacionBinaria {

    private Number dividir(Number num1, Number num2) {

        Double resultado = num1.doubleValue() / num2.doubleValue();
        return resultado;
    }



    @Override
    public Number realizarOperacion(Number num1, Number num2) {
        return dividir(num1, num2);
    }
}
