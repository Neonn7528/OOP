public class Main {
    public static void main(String[] args) {
        Market magGaz = new Market();

        magGaz.enqueue("Миха");
        magGaz.enqueue("Ксюха");
        magGaz.enqueue("Паха");
        System.out.println("Очередь состоит из " + magGaz.queueSize() + " человек.");
        System.out.println();
        
        magGaz.takeOrder("гамбургер");
        magGaz.takeOrder("крылья");
        magGaz.takeOrder("пицца");
        System.out.println();

        magGaz.serveOrder("гамбургер");
        magGaz.serveOrder("крылья");
        magGaz.serveOrder("пицца");
        System.out.println();

        magGaz.update();
        magGaz.update();
        magGaz.update();
        magGaz.update();
    }
}
