import java.util.Queue;
import java.util.LinkedList;


class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<Customer> queue = new LinkedList<>();
    
    // Реализация метода из QueueBehaviour для добавления клиента в очередь
    @Override
    public void addCustomer(Customer customer) {
        queue.add(customer);
        System.out.println(customer.getName() + " добавлен в очередь.");
    }

    // Реализация метода из QueueBehaviour для удаления клиента из очереди
    @Override
    public Customer removeCustomer() {
        Customer customer = queue.poll();
        if (customer != null) {
            System.out.println(customer.getName() + " удален из очереди.");
        }
        return customer;
    }

    // Реализация метода из MarketBehaviour для принятия заказа
    @Override
    public void acceptOrder(Customer customer) {
        System.out.println("Заказ принят от " + customer.getName());
    }

    // Реализация метода из MarketBehaviour для завершения заказа
    @Override
    public void completeOrder(Customer customer) {
        System.out.println("Заказ завершен для " + customer.getName());
    }

    // Метод для обновления состояния магазина
    public void update() {
        if (!queue.isEmpty()) {
            Customer customer = queue.peek();
            if (customer != null) {
                acceptOrder(customer);
                completeOrder(customer);
                removeCustomer();
            }
        } else {
            System.out.println("Очередь пуста, нет клиентов для обслуживания.");
        }
    }
}

