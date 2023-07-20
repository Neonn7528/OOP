public interface MarketBehaviour {
    void enqueue (String person);
    String dequeue();
    int queueSize();
}
