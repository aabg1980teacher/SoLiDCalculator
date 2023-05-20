package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class CosenoTest {
    @Test
    public void Test0() throws Exception {
        CosineCalculator coseno = new CosineCalculator();

        assertEquals(1.0, coseno.Coseno(0.0), 0.0001);
    }

    @Test
    public void Test45() throws Exception {
        CosineCalculator coseno = new CosineCalculator();

        assertEquals(0.7071, coseno.Coseno(45.0), 0.0001);
    }

    @Test
    public void Test90() throws Exception {
        CosineCalculator coseno = new CosineCalculator();

        assertEquals(0.0, coseno.Coseno(90.0), 0.0001);
    }

    @Test
    public void Test180() throws Exception {
        CosineCalculator coseno = new CosineCalculator();

        assertEquals(-1, coseno.Coseno(180.0), 0.0001);
    }

    @Test
    public void Test270() throws Exception {
        CosineCalculator coseno = new CosineCalculator();

        assertEquals(0.0, coseno.Coseno(270.0), 0.0001);
    }

    @Test
    public void Test360() throws Exception {
        CosineCalculator coseno = new CosineCalculator();

        assertEquals(1.0, coseno.Coseno(360.0), 0.0001);
    }

    @Test
    public void TestMenora0() throws Exception {
        CosineCalculator coseno = new CosineCalculator();
        assertEquals(-2.0, coseno.Coseno(-2.0), 0.0001);
    }
    @Test
    public void TestMayora360() throws Exception {
        CosineCalculator coseno = new CosineCalculator();
        assertEquals(-2.0, coseno.Coseno(370.0), 0.0001);
    }
}
