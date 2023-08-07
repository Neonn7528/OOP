import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorModel {//Создаю переменную для результата
    private double result;
    private Logger logger;

      public CalculatorModel() { //делаю логирование в конструкторе
        logger = Logger.getLogger(CalculatorModel.class.getName());
        logger.setLevel(Level.INFO);//будут записываться сообщения только с INFO
        logger.setUseParentHandlers(false);//отключаю использование 
                                                             //родительских обработчиков логов

        ConsoleHandler consoleHandler = new ConsoleHandler();//записываю логи в консоль
        consoleHandler.setLevel(Level.INFO);
        logger.addHandler(consoleHandler);//добавляю созданный обработчик к текущему логгеру
    }

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