public interface MarketBehaviour {
    void enqueue (String person);//добавление людей в конец очереди
    /*переменная 'person' объявляется внутри тела метода enqueue и 
    является аргументом этого метода. */
    String dequeue();//удаление первого человека из очереди
    int queueSize();//количество людей в очереди
}
