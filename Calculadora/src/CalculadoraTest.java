import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.IOException;

/**
 * Clase CalculadoraTest con pruebas unitarias para certificar el funcionamiento de los métodos de la clase Calculadora
 * @author Marcos López
 * @author Lisbeth Poaquiza
 * @since 15-05-2022
 * @version 1.0.0
 */
public class CalculadoraTest {
    private Calculadora pruebasCalculadora;
    private final int num1 = 10;
    private final int num2 = 2;

    /**
     *  Se instancia un objeto calculadora antes de cada test
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución
     */
    @Before
    public void setUp() throws IOException{
        this.pruebasCalculadora = new Calculadora();
    }

    /**
     * Test que verifica la suma entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testSuma1() {
        assertEquals(14, this.pruebasCalculadora.sumar(num1, num2));
    }

    /**
     * Test que verifica la suma entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testSuma2() {
        assertEquals(13, this.pruebasCalculadora.sumar(num1, num2 ));
    }

    /**
     * Test que verifica la suma entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testSuma3() {
        assertEquals(12, this.pruebasCalculadora.sumar(num1, num2 ));
    }

    /**
     * Test que verifica la suma entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testSuma4() {
        assertEquals(11, this.pruebasCalculadora.sumar(num1, num2 ));
    }

    /**
     * Test que verifica la suma entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testSuma5() {
        assertEquals(10, this.pruebasCalculadora.sumar(num1, num2 ));
    }

    /**
     * Test que verifica la resta entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testResta1() {
        assertEquals(10, this.pruebasCalculadora.restar(num1, num2));
    }

    /**
     * Test que verifica la resta entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testResta2() {
        assertEquals(9, this.pruebasCalculadora.restar(num1, num2));
    }

    /**
     * Test que verifica la resta entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testResta3() {
        assertEquals(8, this.pruebasCalculadora.restar(num1, num2));
    }

    /**
     * Test que verifica la resta entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testResta4() {
        assertEquals(7, this.pruebasCalculadora.restar(num1, num2));
    }

    /**
     * Test que verifica la resta entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testResta5() {
        assertEquals(6, this.pruebasCalculadora.restar(num1, num2));
    }

    /**
     * Test que verifica la multiplicación entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testMultiplicacion1() {
        assertEquals(22, this.pruebasCalculadora.multiplicar(num1, num2));
    }

    /**
     * Test que verifica la multiplicación entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testMultiplicacion2() {
        assertEquals(21, this.pruebasCalculadora.multiplicar(num1, num2));
    }

    /**
     * Test que verifica la multiplicación entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testMultiplicacion3() {
        assertEquals(20, this.pruebasCalculadora.multiplicar(num1, num2));
    }

    /**
     * Test que verifica la multiplicación entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testMultiplicacion4() {
        assertEquals(19, this.pruebasCalculadora.multiplicar(num1, num2));
    }

    /**
     * Test que verifica la multiplicación entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testMultiplicacion5() {
        assertEquals(18, this.pruebasCalculadora.multiplicar(num1, num2));
    }

    /**
     * Test que verifica la división entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testDivision1() {
        assertEquals(7, this.pruebasCalculadora.dividir(num1, num2));
    }

    /**
     * Test que verifica la división entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testDivision2() {
        assertEquals(6, this.pruebasCalculadora.dividir(num1, num2));
    }

    /**
     * Test que verifica la división entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testDivision3() {
        assertEquals(5, this.pruebasCalculadora.dividir(num1, num2));
    }

    /**
     * Test que verifica la división entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testDivision4() {
        assertEquals(4, this.pruebasCalculadora.dividir(num1, num2));
    }

    /**
     * Test que verifica la división entre num1 y num2, validando la salida esperada.
     * @see Calculadora
     * @throws IOException por si hay un error en la ejecución 
     */
    @Test
    public void testDivision5() {
        assertEquals(3, this.pruebasCalculadora.dividir(num1, num2));
    }
}