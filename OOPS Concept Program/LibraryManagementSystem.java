abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract int getLoanDuration();

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}

interface Reservable {
    boolean reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public boolean reserveItem() {
        return true;
    }

    public boolean checkAvailability() {
        return true;
    }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }

    public boolean reserveItem() {
        return false;
    }

    public boolean checkAvailability() {
        return true;
    }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 5;
    }

    public boolean reserveItem() {
        return true;
    }

    public boolean checkAvailability() {
        return false;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book(1, "1984", "Harry Potter");
        LibraryItem magazine = new Magazine(2, "Top Billionare", "Various");
        LibraryItem dvd = new DVD(3, "Inception", "Christopher Nolan");

        System.out.println(book.getItemDetails() + ", Loan Duration: " + book.getLoanDuration() + " days");
        System.out.println(magazine.getItemDetails() + ", Loan Duration: " + magazine.getLoanDuration() + " days");
        System.out.println(dvd.getItemDetails() + ", Loan Duration: " + dvd.getLoanDuration() + " days");
    }
}
