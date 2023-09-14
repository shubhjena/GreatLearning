package Week1_Core_Java;

import java.util.ArrayList;

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
