import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Library: " + name);
        if (books.isEmpty()) {
            System.out.println("  No books available.");
        } else {
            for (Book book : books) {
                System.out.println("  Book: " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    public void removeBooks() {
        System.out.println("Removing all books from " + name);
        books.clear();
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("University Library");

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        lib1.addBook(book1);
        lib1.addBook(book2);
        lib2.addBook(book3);

        lib1.showBooks();
        System.out.println();
        lib2.showBooks();

        System.out.println("\nClearing books from City Library...");
        lib1.removeBooks();
        System.out.println();
        lib1.showBooks();
    }
}