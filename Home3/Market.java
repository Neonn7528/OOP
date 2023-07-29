import java.util.LinkedList;
import java.util.Queue;

// реализация класса Market, который реализует интерфейсы QueueBehaviour и MarketBehaviour
public class Market implements QueueBehaviour, MarketBehaviour, Comparable<Market> {
    private Queue<String> queue;// внутренний объект Queue для хранения людей в очереди
    public String queueSize;
    private MarketFunctionalInterface customInterface;

    public Market() {
        queue = new LinkedList<>();
    }
  

    @Override
    public void enqueue(String inputName) {// добавление людей в конец очереди
        queue.add(inputName);
        System.out.println(inputName + " встал(a) в очередь.");
    }

    @Override
    public String dequeue() {// удаление первого человека из очереди
        String person = queue.poll();
        if (person != null) {
            System.out.println(person + " покинул(a) очередь.");
        }
        return person;
    }

    @Override
    public int queueSize() {// количество людей в очереди
        return queue.size();
    }

    @Override
    public void takeOrder(String order) {// принятие заказов
        System.out.println("Заказ " + order + " принят!");
    }

    @Override
    public void serveOrder(String order) {// отдача заказов
        System.out.println(order + " - готово!");
    }


    public void setCustomInterface(MarketFunctionalInterface customInterface) {
        this.customInterface = customInterface;
    }

    public void update() {// обновляет состояние магазина путем принятия и отдачи заказов
        if (queue.isEmpty()) {
            System.out.println("Свободная касса!");
        } else {
            String person = queue.peek();// E peek(): возвращает
                                         // без удаления элемент из начала очереди.
                                         // Если очередь пуста, возвращает значение null
            System.out.println(person + " - забрал заказ!");
            takeOrder("Заказ для " + person);
            serveOrder("Заказ для " + person);
            dequeue();
            if (customInterface != null) {
                customInterface.customMethod();
            }
        }
    }

    @Override
    public void compareTo() {
    System.out.println(queueSize);
    }
}
