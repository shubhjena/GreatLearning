package Backend_Week1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class BookManager {
    ArrayList<Book> bookList = new ArrayList<>();

    boolean addBook(Book book) {
        bookList.add(book);
        return true;
    }

    boolean searchBook(String book) {
//        return bookList.stream().filter(x->x.title.equals(book)).collect(Collectors.toList());
        return false;
    }

    void displayBookList() {
        System.out.println(bookList.toString());
    }
}
