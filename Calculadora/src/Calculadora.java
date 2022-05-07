/**
 * Clase Calculadora que implementa los métodos de la interfaz ICalculadora
 * @author Marcos López
 * @author Lisbeth Poaquiza
 * @since 07-05-2022
 * @version 1.0.0
 */
public class Calculadora implements ICalculadora {
    /**
     * Realizar una operación aritmética que reune varias cantidades en una sola.
     * @param num1 primer entero a sumar
     * @param num2 segundo entero a sumar
     * @return entero que representa la suma de los parámetros
     * @see ICalculadora
     */
    @Override
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Realiza una operación aritmética que quita una cantidad (sustraendo) de otra (minuendo) para averiguar la diferencia entre las dos.
     * @param num1 entero que representa al minuendo
     * @param num2 entero que representa al sustraendo
     * @return entero que representa la diferencia de los parámetros
     * @see ICalculadora
     */
    @Override
    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Aumentar el número o la cantidad de cosas de la misma especie
     * @param num1 primer entero a multiplicar
     * @param num2 segundo entero a multiplicar
     * @return entero que representa el producto de la multiplicación de los parámetros
     * @see ICalculadora
     */
    @Override
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Averigua cuántas veces una cantidad, llamada dividendo, contiene a otra, llamada divisor
     * @param num1 entero que representa al dividendo
     * @param num2 entero que representa al divisor
     * @return entero que representa el cociente de la división de los parámetros
     * @see ICalculadora
     */
    @Override
    public int dividir(int num1, int num2) {
        return num1 / num2;
    }
}