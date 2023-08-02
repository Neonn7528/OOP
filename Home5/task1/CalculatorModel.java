public class CalculatorModel {//Создаем переменную для результата
    private double result;

    public void add(double num1, double num2) {
        result = num1 + num2;
    }

    public void subtract(double num1, double num2) {
        result = num1 - num2;
    }

    public void divide(double num1, double num2) {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            // Обработка деления на ноль
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
    }

    public void multiply(double num1, double num2) {
        result = num1 * num2;
    }

    public double getResult() {
        return result;
    }
}