class LibraryBook
{
    String title, author;
    double price;
    static int bookCount = 0;

    LibraryBook(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
        bookCount++;
    }

    static void displayCount()
    {
        System.out.println("Total books: " + bookCount);
    }

    void displayBook()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rs. " + price);
        System.out.println();
    }

    public static void main(String[] args)
    {
        LibraryBook b1 = new LibraryBook("Harry Potter", "J.K. Rowling", 500
        );

        LibraryBook b2 = new LibraryBook("The Hobbit", "J.R.R. Tolkien", 400
        );

        b1.displayBook();
        b2.displayBook();

        LibraryBook.displayCount();
    }
}