package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionUnaria;

public class OperacionFactorial implements OperacionUnaria {

    @Override
    public Number realizarOperacion(Number num1) {
        if(num1.intValue() < 0)
            throw new IllegalArgumentException("El número no puede ser negativo");
        if(num1.intValue() == 0 || num1.intValue() == 1 )
            return 1;
        long resultado = 1L;

        for (int i=2; i <= num1.intValue(); i++){
            resultado *=i;
        }

        return resultado;//:)
    }
}
