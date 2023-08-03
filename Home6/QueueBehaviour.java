// Интерфейс для управления очередью
public interface QueueBehaviour {
    void enqueue(String person);
    String dequeue();
    int queueSize();
}