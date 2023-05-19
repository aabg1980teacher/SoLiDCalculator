package co.edu.javeriana.ingsoft.solid.refactor.logica.creacion;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionUnaria;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreadorDinamico extends CreadorBase {


    @Override
    public OperacionBinaria getOperacion(String operacion) {
        try {
            Class operacionBinaria = Class.forName("co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.Operacion" + operacion);
            Constructor<?> constructor = operacionBinaria.getConstructor(null);
            OperacionBinaria resultado = (OperacionBinaria) constructor.newInstance(null);
            return resultado;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public OperacionUnaria getOperacionUnaria(String operacion) {
        try {
            Class operacionUnaria = Class.forName("co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.Operacion" + operacion);
            Constructor<?> constructor = operacionUnaria.getConstructor(null);
            OperacionUnaria resultado = (OperacionUnaria) constructor.newInstance(null);
            return resultado;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
