package task2;

    public class Main {
        public static void main(String[] args) {
            Rectangle rectangle1 = new Rectangle();
            System.out.println("Площадь прямоугольника: " + rectangle1.calculateArea());
            System.out.println("Периметр прямоугольника: " + rectangle1.calculatePerimeter());
    
            Rectangle rectangle2 = new Rectangle(3.2, 4.1);
            System.out.println("Площадь прямоугольника: " + rectangle2.calculateArea());
            System.out.println("Периметр прямоугольника: " + rectangle2.calculatePerimeter());
    }
}