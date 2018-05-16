import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Book book;

    @Test
    public void hasNumberOfBooks(){
        Library library = new Library();
        library.addBook(book);
        assertEquals(1, library.countBooks());

    }
    @Test
    public void canAddBook(){
        Library library = new Library();
        library.addBook(book);
        assertEquals(1,library.countBooks());
    }



    @Test
    public void fillsToCapacity(){

        Library library = new Library();
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.countBooks());



    }


}
