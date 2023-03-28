package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base;


@FunctionalInterface
public interface OperacionBinariaEntero extends OperacionBinaria{

    long realizarOperacion(int a, int b);
}
