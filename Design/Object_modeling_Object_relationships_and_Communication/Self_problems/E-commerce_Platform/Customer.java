import java.util.ArrayList;

public class Customer {
    String name;
    ArrayList<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed order " + o.orderId);
    }

    public void showOrders() {
        for (Order o : orders) {
            System.out.println("Order ID: " + o.orderId);
            o.showProducts();
        }
    }
}
