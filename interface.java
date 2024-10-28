
interface QueueBehaviour {
    void addCustomer(Customer customer);
    Customer removeCustomer();
}

interface MarketBehaviour {
    void acceptOrder(Customer customer);
    void completeOrder(Customer customer);
}
