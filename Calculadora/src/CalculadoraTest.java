import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.IOException;

public class CalculadoraTest {
    private Calculadora pruebasCalculadora;
    private final int num1 = 10;
    private final int num2 = 2;
    
    @Before
    public void setUp() throws IOException{
         this.pruebasCalculadora = new Calculadora();
    }
    
    @Test
    public void testSuma1() {
        assertEquals(14, this.pruebasCalculadora.sumar(num1, num2 ));
    }
    @Test
    public void testSuma2() {
        assertEquals(13, this.pruebasCalculadora.sumar(num1, num2 ));
    }
    @Test
    public void testSuma3() {
        assertEquals(12, this.pruebasCalculadora.sumar(num1, num2 ));
    }
    @Test
    public void testSuma4() {
        assertEquals(11, this.pruebasCalculadora.sumar(num1, num2 ));
    }
    @Test
    public void testSuma5() {
        assertEquals(10, this.pruebasCalculadora.sumar(num1, num2 ));
    }



    @Test
    public void testResta1() {
        assertEquals(10, this.pruebasCalculadora.restar(num1, num2));
    }
    @Test
    public void testResta2() {
        assertEquals(9, this.pruebasCalculadora.restar(num1, num2));
    }
    @Test
    public void testResta3() {
        assertEquals(8, this.pruebasCalculadora.restar(num1, num2));
    }
    @Test
    public void testResta4() {
        assertEquals(7, this.pruebasCalculadora.restar(num1, num2));
    }
    @Test
    public void testResta5() {
        assertEquals(6, this.pruebasCalculadora.restar(num1, num2));
    }

    @Test
    public void testMultiplicacion1() {
        assertEquals(22, this.pruebasCalculadora.multiplicar(num1, num2));
    }
    @Test
    public void testMultiplicacion2() {
        assertEquals(21, this.pruebasCalculadora.multiplicar(num1, num2));
    }
    @Test
    public void testMultiplicacion3() {
        assertEquals(20, this.pruebasCalculadora.multiplicar(num1, num2));
    }
    @Test
    public void testMultiplicacion4() {
        assertEquals(19, this.pruebasCalculadora.multiplicar(num1, num2));
    }
    @Test
    public void testMultiplicacion5() {
        assertEquals(18, this.pruebasCalculadora.multiplicar(num1, num2));
    }
    
    
  
    @Test
    public void testDivision1() {
        assertEquals(7, this.pruebasCalculadora.dividir(num1, num2));
    }
    @Test
    public void testDivision2() {
        assertEquals(6, this.pruebasCalculadora.dividir(num1, num2));
    }
    @Test
    public void testDivision3() {
        assertEquals(5, this.pruebasCalculadora.dividir(num1, num2));
    }
    @Test
    public void testDivision4() {
        assertEquals(4, this.pruebasCalculadora.dividir(num1, num2));
    }
    @Test
    public void testDivision5() {
        assertEquals(3, this.pruebasCalculadora.dividir(num1, num2));
    }
   
}