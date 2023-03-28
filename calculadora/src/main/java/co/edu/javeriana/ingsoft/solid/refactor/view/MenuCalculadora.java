package co.edu.javeriana.ingsoft.solid.refactor.view;

import java.util.Scanner;

import co.edu.javeriana.ingsoft.solid.refactor.logica.Calculadora;

public class MenuCalculadora {
    private Calculadora calculadora;
    public MenuCalculadora() {
        calculadora = new Calculadora();
    }
    public void ejecutarCalculadora() {
        String operacion = "";
        try (Scanner sc = new Scanner(System.in)) {
            while(!operacion.equalsIgnoreCase("exit")) {
                System.out.println("Bienvenido a la calculadora");
                int num1, num2;
                System.out.println("Ingrese el primer numero");
                num1 = sc.nextInt();

                System.out.println("Ingrese el segundo numero");
                num2 = sc.nextInt();
                System.out.println("Ingrese la operacion a realizar");
                operacion = sc.next();
                realizarCalculo(operacion, num1, num2);
            }
        }
        catch (Exception e) {
            System.err.println("Error al ejecutar la calculadora " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Gracias por usar la calculadora");
    }
    private void realizarCalculo(String operacion, int num1, int num2) {
        Long resultado = null;
        Float resultadoDecimal = null;
        switch (operacion) {
            case "+":
                resultado = calculadora.sumar(num1, num2);
                break;
            case "-":
                resultado = calculadora.restar(num1, num2);
                break;
            case "*":
                resultado = calculadora.multiplicar(num1, num2);
                break;
            case "/":
                resultadoDecimal = calculadora.dividir(num1, num2);
                break;
            case "%":
                resultado = calculadora.modular(num1, num2);
                break;
            default:
                System.out.println("Operacion no valida");
                break;
        }
        System.out.println("El resultado de la operacion " + operacion + " es "
                + (operacion.equalsIgnoreCase("/") ? resultadoDecimal : resultado));
    }
}
