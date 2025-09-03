class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " more " + itemName + " added.");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " " + itemName + " removed.");
        } else {
            System.out.println("Not enough items to remove!");
        }
    }

    double calculateTotalCost() {
        return price * quantity;
    }

    void displayCart() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

public class ShoppingCartTest {
    public static void main(String[] args) {
        CartItem c1 = new CartItem("Shoes", 2000, 2);
        c1.addItem(1);
        c1.removeItem(1);
        c1.displayCart();
    }
}
