/*В результате, мы разделили ответственность класса Market 
на два интерфейса и классы - QueueBehaviour и OrderBehaviour, 
и добавили два отдельных класса - QueueManager и OrderProcessor. 
Класс Market теперь объединяет эти два класса и предоставляет 
обобщенный интерфейс для работы с очередью и обработки заказов.*/

// Класс, объединяющий управление очередью и обработку заказов
public class Market {
    private QueueBehaviour queueManager;
    private OrderProcessor orderProcessor;

    public Market(QueueBehaviour queueManager, OrderProcessor orderProcessor2) {
        this.queueManager = queueManager;
        this.orderProcessor = orderProcessor2;
    }

    public void enqueue(String person) {
        queueManager.enqueue(person);
    }

    public String dequeue() {
        return queueManager.dequeue();
    }

    public int getQueueSize() {
        return queueManager.queueSize();
    }

    public void takeOrder(String order) {
        orderProcessor.takeOrder(order);
    }

    public void serveOrder(String order) {
        orderProcessor.serveOrder(order);
    }

    public void update() {
        if (queueManager.queueSize() == 0) {
            System.out.println("Свободная касса!");
        } else {
            String person = queueManager.dequeue();
            System.out.println(person + " - забрал заказ!");
        }
    }
}