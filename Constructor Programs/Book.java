public class Book {
    private String title;
    private String author;
    private int price;

    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public String getTitle() {
        System.out.println("The Title of Book is : " + title);
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        System.out.println("The Author of Book is : " + author);
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        System.out.println("The Price of Book is : " + price);
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling", 2999);
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: " + book1.getPrice());
    }
}