package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionUnaria;

public class OperacionRaizCuadrada implements OperacionUnaria {

    public Number realizarOperacion (Number num1){
        //si el número ingresado es negativo
        if (num1.doubleValue()< 0){ //intValue convertidor de integer a int
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        //si el número ingresado es 0
        if (num1.intValue()== 0){
            return 0;
        }
        //si el número ingresado es 1
        if (num1.intValue()==1){
            return 1;
        }
        //si el número es mayor que el límite del dominio
        if (num1.doubleValue()==Double.MAX_VALUE){ //doubleValue convertidor de integer a double
            throw new IllegalArgumentException("El número supera el limite");
        }
        //si el número es 1.7976931348623157e+308
        if (num1.doubleValue()==1.7976931348623157e+308){ //doubleValue convertidor de integer a double
            throw new IllegalArgumentException("El número supera el máximo valor de double");
        }

        //raiz cuadrada
        double resultado;
        resultado = Math.sqrt(num1.doubleValue());

        return resultado;
    }




}