package co.edu.javeriana.ingsoft.solid.refactor.logica;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.*;


public class Calculadora {
    public long sumar(int num1, int num2) {
        OperacionSuma suma = new OperacionSuma();
        return suma.sumar(num1, num2);
    }
    public long restar(int num1, int num2) {
        OperacionResta operacionResta = new OperacionResta();
        return operacionResta.restar(num1, num2);
    }
    public long multiplicar(int num1, int num2) {
        OperacionMultiplicacion operacionMultiplicacion = new OperacionMultiplicacion();
        return operacionMultiplicacion.multiplicar(num1, num2);
    }
    public float dividir(int num1, int num2) {
        OperacionDivision operacionDivision = new OperacionDivision();
        return operacionDivision.dividir(num1, num2);
    }
    public long modular(int num1, int num2) {
        OperacionModulo operacionModulo = new OperacionModulo();
        return operacionModulo.modular(num1, num2);
    }
}
