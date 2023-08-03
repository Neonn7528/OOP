// Класс, реализующий только интерфейс QueueBehaviour

import java.util.LinkedList;
import java.util.Queue;

public class QueueManager implements QueueBehaviour {
    private Queue<String> queue;

    public QueueManager() {
        queue = new LinkedList<>();
    }

    @Override
    public void enqueue(String person) {
        queue.add(person);
        System.out.println(person + " встал(a) в очередь.");
    }

    @Override
    public String dequeue() {
        String person = queue.poll();
        if (person != null) {
            System.out.println(person + " покинул(a) очередь.");
        }
        return person;
    }

    @Override
    public int queueSize() {
        return queue.size();
    }
}
