package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

public class CosineCalculator {

    CosineCalculator() {
    }

    public double Coseno(double Value) {

        if (Value < 0 || Value > 360.0) {
            System.out.println("Los valores son entre 0 y 360");
            return -2.0;
        } else {
            Value = Math.toRadians(Value);

            return Math.cos(Value);
        }
    }
}
