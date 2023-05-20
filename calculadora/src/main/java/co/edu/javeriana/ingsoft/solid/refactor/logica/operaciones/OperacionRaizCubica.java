package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionUnaria;

public class OperacionRaizCubica implements OperacionUnaria{


    // ----- Atribbutes -----



    // ----- Constructor -----



    // ----- Methods -----
    private Number raizCubica(Number num1) {

        // Handling of numbers that aren't integers.
        if ((num1.doubleValue()%1) != 0) {
            throw new IllegalArgumentException("El numero no es entero.");
        }

        // Calculatin of cbrt for ints.
        return Math.cbrt(num1.intValue());
    }

    @Override
    public Number realizarOperacion(Number num1) {
        return raizCubica(num1);
    }

}