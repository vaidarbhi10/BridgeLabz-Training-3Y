import java.util.ArrayList;

public class Order {
    int orderId;
    ArrayList<Product> products = new ArrayList<>();
    public Order(int orderId) {
        this.orderId = orderId;
    }
    public void addProduct(Product p) {
        products.add(p);
    }
    public void showProducts() {
        for (Product p : products) {
            System.out.println(p.name + " - $" + p.price);
        }
    }
}
