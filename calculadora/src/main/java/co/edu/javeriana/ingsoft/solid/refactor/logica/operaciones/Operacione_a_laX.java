package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionUnaria;

public class Operacione_a_laX implements OperacionUnaria{

    @Override
    public Number realizarOperacion(Number num2) {
        Number result = Math.exp(num2.doubleValue());


        System.out.println("El resultado de e^x es: " + result);
        return result;
    }
}