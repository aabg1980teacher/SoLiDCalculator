package co.edu.javeriana.ingsoft.solid.refactor.logica.creacion;

import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.*;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinariaEntero;
import co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones.base.OperacionBinariaDecimal;

import java.util.HashMap;
import java.util.Map;

public class CreadorOperacion extends CreadorBase{

    private Map<String, OperacionBinariaEntero> operacionBinariaMap;

    private void init() {
        operacionBinariaMap.put("Suma", new OperacionSuma());
        operacionBinariaMap.put("Resta", new OperacionResta());
        operacionBinariaMap.put("Multiplicacion", new OperacionMultiplicacion());
        operacionBinariaMap.put("Modulo", new OperacionModulo());
        operacionBinariaMap.put("Potencia", new OperacionPotencia());
        operacionBinariaMap.put("Concatenacion", new OperacionConcatenar());
    }
    public CreadorOperacion() {
        operacionBinariaMap = new HashMap<>();
        init();
    }

    @Override
    public OperacionBinariaEntero getOperacion(String operacion) {
        return operacionBinariaMap.get(operacion);
    }

    @Override

    public OperacionBinariaDecimal getOperacionBinariaDecimal(String operacion) {
        return null;
    }
}
