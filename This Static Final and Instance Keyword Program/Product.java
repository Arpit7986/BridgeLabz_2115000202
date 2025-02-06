import java.util.*;
class Product
{
    private static double discount=10;
    private String productName;
    private int price;
    private int quantity;
    private final int productId;
    public Product(String productName,int price,int quantity,int productId)
    {
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        this.productId=productId;
    }
    public static void updateDiscount(double updateDiscount)
    {
        discount=updateDiscount;
        System.out.println("Updated Discount is "+updateDiscount);
    }
    public void displayDetails()
    {
        if(this instanceof Product)
        {
            System.out.println("Product Name : "+productName);
            System.out.println("Product Price : "+price);
            System.out.println("Product Quantity : "+quantity);
            System.out.println("Product Id : "+productId);
            System.out.println();
        }
        else
        System.out.println("Invalid Product Instance");
    }
    public static void main(String[] args)
    {
        Product p1=new Product("LED", 50000, 5, 1);
        Product p2=new Product("AC", 30000, 10, 2);
        p1.displayDetails();
        p2.displayDetails();
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Updated discount");
        double userDiscount=sc.nextDouble();
        Product.updateDiscount(userDiscount);    
    }
}