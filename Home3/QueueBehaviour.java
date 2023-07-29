public interface QueueBehaviour {

    void takeOrder (String order);//принятие заказов
    void serveOrder (String order);//отдача заказов
}