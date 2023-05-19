package co.edu.javeriana.ingsoft.solid.refactor.logica;

import co.edu.javeriana.ingsoft.solid.refactor.logica.creacion.CreadorBase;
import co.edu.javeriana.ingsoft.solid.refactor.logica.creacion.CreadorDinamico;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionUnaria;

import java.util.Scanner;


public class Calculadora {
    private OperacionBinaria operacionBinaria;

    private OperacionUnaria operacionUnaria;

    private CreadorBase creadorOperacion;

    public Calculadora() {
        creadorOperacion = new CreadorDinamico();
    }


    public Number ejecutarOperacion(Number numero1, Number numero2, String operacion) {

        Number resultado = null;

        if (operacion.equals("Logaritmo")) {

            int a;
            Scanner cin = new Scanner(System.in);
            System.out.println("Que numero de los que ingreso desea usar para esta operacion?");
            System.out.println("1. " + numero1);
            System.out.println("2. " + numero2);
            a = cin.nextInt();

            if (a == 1) {
                operacionUnaria = creadorOperacion.getOperacionUnaria(operacion);
                resultado =  operacionUnaria.realizarOperacion(numero1);
            } else if (a == 2) {
                operacionUnaria = creadorOperacion.getOperacionUnaria(operacion);
                resultado = operacionUnaria.realizarOperacion(numero2);
            } else {
                System.out.println("valor invalido, intente de nuevo");
            }
        }else {
            operacionBinaria = creadorOperacion.getOperacion(operacion);
            resultado = operacionBinaria.realizarOperacion(numero1, numero2);
        }
        return resultado;
    }
}

