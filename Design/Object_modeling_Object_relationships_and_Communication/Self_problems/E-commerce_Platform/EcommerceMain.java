public class EcommerceMain {
    public static void main(String[] args) {
        Customer c1 = new Customer("John");
        Product p1 = new Product("Laptop", 1200);
        Product p2 = new Product("Phone", 800);
        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);
        c1.placeOrder(o1);
        c1.showOrders();
    }
}
