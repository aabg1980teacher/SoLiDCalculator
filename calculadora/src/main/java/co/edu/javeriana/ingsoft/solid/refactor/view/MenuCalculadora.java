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
                System.out.println("Bienvenido a la calculadora !!");
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
        Long resultado = 0L;
        Double resultadoDecimal = null;
        Integer resultadoEntero = 0; // Variable para guardar el resultado entero del MCU
        switch (operacion) {
            case "Suma": case "Resta": case "Multiplicacion": case "Modulo":
                resultado = (Long) calculadora.ejecutarOperacion(num1, num2, operacion);
                System.out.println("El resultado de la operacion " + operacion + " es "
                        + (operacion.equalsIgnoreCase("/") ? resultadoDecimal : resultado));
                break;
            case "Division": case "Raiz":
                resultadoDecimal = (Double) calculadora.ejecutarOperacion(num1, num2, operacion);
                System.out.println("El resultado de la operacion " + operacion + " es "
                        + (operacion.equalsIgnoreCase("/") ? resultadoDecimal : resultadoDecimal));
                break;
            case "MCU": // Agregar el caso "MCU"
                resultadoEntero = (Integer)calculadora.ejecutarOperacion(num1, num2,operacion);
                System.out.println("El resultado de la operacion " + operacion + " es "
                        + (operacion.equalsIgnoreCase("/") ? resultadoDecimal : resultadoEntero));
                break;
            default:
                System.out.println("Operacion no valida");
                break;
        }
}
