package co.edu.javeriana.ingsoft.solid.refactor.logica.operaciones;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MCUTest {

    @Test
    public void caso1(){
        OperacionMCU mcu= new OperacionMCU();
        assertEquals(1,mcu.realizarOperacion(2,99));
    }
    @Test
    public void caso2(){
        OperacionMCU mcu= new OperacionMCU();
        assertThrows(NumInvalido.class,()->mcu.realizarOperacion(88,-5));
    }
    @Test
    public void caso3(){
        OperacionMCU mcu= new OperacionMCU();
        assertThrows(NumInvalido.class,()->mcu.realizarOperacion(43,106));
    }
    @Test
    public void caso4(){
        OperacionMCU mcu= new OperacionMCU();
        assertThrows(NumInvalido.class,()->mcu.realizarOperacion(1,54));
    }
    @Test
    public void caso5(){
        OperacionMCU mcu= new OperacionMCU();
        assertThrows(NumInvalido.class,()->mcu.realizarOperacion(100,99));
    }

}
