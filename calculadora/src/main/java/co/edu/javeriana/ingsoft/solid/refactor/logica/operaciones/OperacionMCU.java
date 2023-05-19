package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;

public class OperacionMCU implements OperacionBinaria {
    @Override
    public Integer realizarOperacion(Number num1, Number num2) {
        int resultadoEntero = calcularMCU(num1.intValue(), num2.intValue());
        return resultadoEntero;
    }

    private int calcularMCU(int num1, int num2) {
        num1 = Math.abs(num1); // Asegurar número positivo
        num2 = Math.abs(num2); // Asegurar número positivo

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

}