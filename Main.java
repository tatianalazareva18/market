public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Customer customer1 = new Customer("Иван");
        Customer customer2 = new Customer("Ольга");
        
        market.addCustomer(customer1);
        market.addCustomer(customer2);
        
        // Обновляем состояние магазина
        market.update(); // Иван будет принят и удален из очереди после завершения заказа
        market.update(); // Ольга будет принята и удалена из очереди
        market.update(); // Сообщение о пустой очереди
    }
}
