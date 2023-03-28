package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinariaDecimal;

public class OperacionDivision implements OperacionBinariaDecimal {

    private float dividir(int num1, int num2) {

        float resultado = (float)num1 / (float)num2;
        return resultado;
    }

    @Override
    public double realizarOperacion(int a, int b) {
        return dividir(a,b);
    }
}
