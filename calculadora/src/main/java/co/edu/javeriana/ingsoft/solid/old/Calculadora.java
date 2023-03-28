package co.edu.javeriana.ingsoft.solid.old;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Calculadora
{

    public void ejecutarCalculadora() {
        String operacion = "";
        Scanner sc = new Scanner(System.in);
        while(!operacion.equalsIgnoreCase("exit")) {
            System.out.println("Bienvenido a la calculadora");
            int num1, num2;
            System.out.println("Ingrese el primer numero");
            num1 = sc.nextInt();

            System.out.println("Ingrese el segundo numero");
            num2 = sc.nextInt();
            System.out.println("Ingrese la operacion a realizar");
            operacion = sc.next();


            int resultado = 0;
            switch (operacion) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    resultado = num1 / num2;
                    break;
                case "%":
                    resultado = num1 % num2;
                    break;
                default:
                    System.out.println("Operacion no valida");
                    break;
            }
            System.out.println("El resultado es " + resultado);
        }

        System.out.println("Gracias por usar la calculadora");
    }
    public static void main( String[] args )
    {
        Calculadora c = new Calculadora();
        c.ejecutarCalculadora();
    }
}
