public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;
    
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public String getTitle() {
        System.out.println("Title of Book is : " + title);
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        System.out.println("Author of Book is : " + author);
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        System.out.println("Price of Book is : " + price);
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        System.out.println("Is the book available? " + isAvailable);
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed the book from Library: " + title);
        } else {
            System.out.println("Sorry, the book: " + title + " is currently unavailable in the library.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Is the book available? " + isAvailable);
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Harry Potter", "J.K Rowling", 999);
        book1.displayDetails();
        book1.borrowBook();
        book1.borrowBook();
    }
}