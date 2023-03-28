package co.edu.javeriana.ingsoft.solid.refactor.logica.creacion;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinaria;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinariaEntero;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinariaDecimal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreadorDinamico extends CreadorBase {


    @Override
    public OperacionBinariaEntero getOperacion(String operacion) {
        return (OperacionBinariaEntero) getOperacionBinaria(operacion);
    }

    private OperacionBinaria getOperacionBinaria(String operacion) {
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
    public OperacionBinariaDecimal getOperacionBinariaDecimal(String operacion) {
        return (OperacionBinariaDecimal) getOperacionBinaria(operacion);
    }
}
