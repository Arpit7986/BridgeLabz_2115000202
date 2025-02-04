class Book
{
    private static String libraryName="GLA Library";
    private String title;
    private String author;
    private final int isbn;
    public Book(String title,String author,int isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public static void displayLibraryName()
    {
        System.out.println("Name of Library is "+libraryName);
    }
    public void displayDetails()
    {
        if(this instanceof Book)
        {
            System.out.println("Title of Book : "+title);
            System.out.println("Author of Book : "+author);
            System.out.println("ISBN Number of Book : "+isbn);
            System.out.println();
        }
        else
        System.out.println("Invalid Book Instance");
    }
    public static void main(String[] args) 
    {
        Book b1=new Book("Harry Potter", "J.K Rowling",98751);
        Book b2=new Book("Java Progarmming","James Gosling",98745);
        b1.displayDetails();
        b2.displayDetails();
        Book.displayLibraryName();    
    }
}