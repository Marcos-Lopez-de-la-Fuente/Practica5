public class Calculadora implements ICalculadora {
    
    @Override
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int dividir(int num1, int num2) {
        return num1 / num2;
    }

}