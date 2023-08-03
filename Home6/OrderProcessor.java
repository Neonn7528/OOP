// Класс, реализующий только интерфейс OrderBehaviour
public class OrderProcessor implements OrderBehaviur {
    @Override
    public void takeOrder(String order) {
        System.out.println("Заказ " + order + " принят!");
    }

    @Override
    public void serveOrder(String order) {
        System.out.println(order + " - готово!");
    }
}