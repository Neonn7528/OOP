public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр QueueManager
        QueueBehaviour queueManager = new QueueManager();

        // Создаем экземпляр OrderProcessor
        OrderProcessor orderProcessor = new OrderProcessor();

        // Создаем экземпляр Market, передавая QueueManager и OrderProcessor
        Market market = new Market(queueManager, orderProcessor);

        // Пример использования Market
        market.update();
        
        market.enqueue("Миха");

        market.takeOrder("Burger");

        market.serveOrder("Burger");

        market.dequeue();

        market.update();

        
    }
}
