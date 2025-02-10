import java.util.ArrayList;
import java.util.List;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

   
    public abstract double calculateDiscount();
    public abstract double calculateTax();

    public double getFinalPrice() {
        return getPrice() - calculateDiscount() + calculateTax();
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Tax: " + calculateTax());
        System.out.println("Final Price: " + getFinalPrice());
    }
}

interface Taxable {
    public double calculateTax();
    public void getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double discount;

    public Electronics(int productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
    }

    @Override
    public double calculateDiscount() {
        return (getPrice() * discount) / 100;
    }

    @Override
    public double calculateTax() {
        return (getPrice() * 18) / 100;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Electronics Tax: " + calculateTax());
    }
}

class Clothing extends Product implements Taxable {
    private double discount;

    public Clothing(int productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
    }

    @Override
    public double calculateDiscount() {
        return (getPrice() * discount) / 100;
    }

    @Override
    public double calculateTax() {
        return (getPrice() * 12) / 100;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Clothing Tax: " + calculateTax());
    }
}

class Groceries extends Product implements Taxable {
    private double discount;

    public Groceries(int productId, String name, double price, double discount) {
        super(productId, name, price);
        this.discount = discount;
    }

    @Override
    public double calculateDiscount() {
        return (getPrice() * discount) / 100;
    }

    @Override
    public double calculateTax() {
        return (getPrice() * 6) / 100;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Groceries Tax: " + calculateTax());
    }
}

public class ECommercePlatform {
    public static void main(String args[]) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(101, "Laptop", 50000, 10));
        products.add(new Clothing(102, "T-Shirt", 2000, 20));
        products.add(new Groceries(103, "Bag", 1500, 5));

        for (Product product : products) {
            System.out.println("\nProduct Details:");
            product.displayDetails();
        }
    }
}
