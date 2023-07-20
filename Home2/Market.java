import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<String> queue;
    public String queueSize;
    public Market(){
       queue = new LinkedList<>();
    } 

    @Override
    public void enqueue(String person){
        queue.add(person);
        System.out.println(person + " встал(a) в очередь.");
    }
    @Override
    public String dequeue (){
        String person = queue.poll();
            if (person != null){
                System.out.println(person + " покинул(a) очередь.");
        }
        return person;
    }
    @Override
    public int queueSize(){
        return queue.size();
    }
    @Override
    public void takeOrder(String order) {
        System.out.println("Заказ " + order + " принят!");
    }
    @Override
    public void serveOrder(String order) {
        System.out.println(order + " - готово!");
    }
    public void update(){
        if (queue.isEmpty()){
            System.out.println("Свободная касса!");
       }
       else {
        String person = queue.peek();//E peek(): возвращает 
                                    //без удаления элемент из начала очереди.
                                    // Если очередь пуста, возвращает значение null
        System.out.println(person + " - забрал заказ!");
        dequeue();
       }
    }
    
}
