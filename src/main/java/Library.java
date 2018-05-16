import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity = 3;
    Book book;


    public Library() {

        this.books = new ArrayList<Book>();//default value

    }


    public int countBooks() {

        return this.books.size();
    }

    public void addBook(Book book) {

        if (this.books.size() < capacity) {

            this.books.add(book);

        }
    }

    public void fillToCapacity(Book book){
        int x = 0;
        while (x <= capacity)
        {
            this.books.add(book);


        }
        x++;
    }

}
//    Write a method to count the number of books in the library.
//    Write a method to add a book to the library stock.
//    Add a capacity to the library and write a method to check if stock is full before adding a book.




