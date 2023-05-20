package calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import calculadora.src.main.java.co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionUnaria;

public class OperacionAbsoluto implements OperacionUnaria {
    @Override
    public Number realizarOperacion(Number num1)
    {
        if(num1.longValue()<0)
        {
            num1=num1.longValue() * -1;
        }
        return num1.longValue();

    }
}
