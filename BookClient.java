public class BookClient{
    public static void main(String []args){
        Book book = new Book("Arpit Jain", "Java Programming Language", 2000);
        book.getAuthorName();
        book.getTitle();
        book.getPrice();
        book.displayDetails();
    }
}