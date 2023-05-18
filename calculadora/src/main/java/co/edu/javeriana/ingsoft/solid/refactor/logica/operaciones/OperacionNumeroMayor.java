package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;

import static java.lang.Integer.MAX_VALUE;

public class OperacionNumeroMayor implements OperacionBinaria {

    public Number numeroMayor(Number num1, Number num2){

        if(num1.intValue()<Integer.MAX_VALUE && num2.intValue()<Integer.MAX_VALUE) {
            if(num1.intValue()>Integer.MIN_VALUE && num2.intValue()>Integer.MIN_VALUE) {
                if (num1.intValue() > num2.intValue()) {
                    return num1.intValue();
                } else if (num1.intValue() < num2.intValue()) {
                    return num2.intValue();
                } else {
                    throw new IllegalArgumentException("Los numeros son iguales. Ninguno es mayor.");
                }
            }else{
                throw new IllegalArgumentException("Por lo menos un numero esta por debajo del rango minimo de los enteros (Integer).");
            }
        }else{
            throw new IllegalArgumentException("Por lo menos un numero esta por encima del rango maximo de los enteros (Integer).");
        }
    }


    @Override
    public Number realizarOperacion(Number num1, Number num2) { return numeroMayor(num1,num2);}
}
