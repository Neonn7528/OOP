/*обобщенные методы позволяют нам писать код, 
который может работать с различными типами данных, 
обеспечивая простоту и гибкость использования. */
public class Main {

    public static <T> void printElement(T element) {// обобщенный метод printElement, 
                                                    //который принимает параметр с типом T
        System.out.println(element);
    }

    public static void main(String[] args) {
        Integer integer = 10;
        printElement(integer);

        String string = "Hello";
        printElement(string);

        Double doubleValue = 3.14;
        printElement(doubleValue);
    }
}