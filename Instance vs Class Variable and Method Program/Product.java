public class Product{
    private String productName;
    private int price;
    static int totalProducts;

    public Product(String productName, int productPrice){
        this.productName = productName;
        this.price = productPrice;
        totalProducts++;
    }

    public String getProductName(){
        System.out.println("Product Name : " + this.productName);
        return this.productName;
    }

    public void setProductName(String newProductName){
        this.productName = newProductName;
    }

    public int getProductPrice(){
        System.out.println("Product Price : " + this.price);
        return this.price;
    }

    public void setProductPrice(int newPrice){
        this.price = newPrice;
    }

    public void displayProductDetails(){
        System.out.println("Products Details : ");
        System.out.println("Name = " + this.productName);
        System.out.println("Price = " + this.price);
        System.out.println();

    }

    public static int displayTotalProducts(){
        System.out.println("Total Number of Products : " + totalProducts);
        return totalProducts;
    }
}

class Main{
    public static void main(String []args){
        Product product1 = new Product("LED", 80000);
        product1.displayProductDetails();

        Product product2 = new Product("AC", 40000);
        product2.displayProductDetails();

        Product product3 = new Product("Table", 10000);
        product3.displayProductDetails();

        Product.displayTotalProducts();
    }

}