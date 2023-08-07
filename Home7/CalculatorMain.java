public class CalculatorMain {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        String operation = view.getOperation();
        double num1 = view.getOperand();
        double num2 = view.getOperand();

        controller.perfomeOperation(operation, num1, num2);
    }
}