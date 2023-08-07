import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }

    public String getOperation() {
        System.out.println("Введите опeрацию:(+,-,*,/)");
        return scanner.nextLine();
    }
    public double getOperand(){
        System.out.println("Введите число: ");
        return Double.parseDouble(String.valueOf(scanner.nextDouble()));
    }
}