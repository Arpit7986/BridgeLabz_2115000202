abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.1;
    }

    public String getDiscountDetails() {
        return "10% discount on Veg Items";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_CHARGE = 20.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + NON_VEG_CHARGE;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    public String getDiscountDetails() {
        return "5% discount on Non-Veg Items";
    }
}

public class OnlineFoodDeliverySystem {
    public static void processOrder(FoodItem foodItem) {
        System.out.println(foodItem.getItemDetails());
        System.out.println("Total Price: " + foodItem.calculateTotalPrice());

        if (foodItem instanceof Discountable) {
            Discountable discountItem = (Discountable) foodItem;
            System.out.println(discountItem.getDiscountDetails());
            System.out.println("Discount Applied: " + discountItem.applyDiscount());
            System.out.println("Final Price After Discount: " + (foodItem.calculateTotalPrice() - discountItem.applyDiscount()));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FoodItem veg = new VegItem("Paneer Tikka", 150.0, 2);
        FoodItem nonVeg = new NonVegItem("Chicken", 250.0, 1);

        processOrder(veg);
        processOrder(nonVeg);
    }
}
