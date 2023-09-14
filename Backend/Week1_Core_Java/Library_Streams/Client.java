package Week1_Core_Java.Library_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Client {
    static Library library = new Library();

    //method to return searched books
    public static List<Book> getBooks(String fieldName, String value){
        List<Book> books = new ArrayList<>();
        if(Objects.equals(fieldName, FieldName.Author.name())){
            books = library.getBookList().stream().filter(x -> x.getAuthor().equalsIgnoreCase(value)).collect(Collectors.toList());
        }else if (Objects.equals(fieldName, FieldName.Title.name())) {
            books = library.getBookList().stream().filter(x -> x.getTitle().equalsIgnoreCase(value)).collect(Collectors.toList());
        }else if (Objects.equals(fieldName, FieldName.Publisher.name())) {
            books = library.getBookList().stream().filter(x -> x.getPublisher().equalsIgnoreCase(value)).collect(Collectors.toList());
        }
        if(books.isEmpty()){
            System.out.println(fieldName+" Not Found");
        }
        return books;
    }

    //method to add books to book list
    public static void addBookToLibrary(Book book){
        library.getBookList().add(book);
    }

    public static void print(List<Book> books){
        for(Book book : books){
            System.out.println("Author:"+book.getAuthor());
        }
    }

    private static Book createBook(String title, String author, String publisher){
        Book book = new Book();
        book.setAuthor(author);
        book.setTitle(title);
        book.setPublisher(publisher);
        return book;
    }
    public static void main(String[] args) {
        addBookToLibrary(createBook("Title1", "Author1","Publisher1"));
        addBookToLibrary(createBook("Title2", "Author2","Publisher2"));
        addBookToLibrary(createBook("Title3", "Author3","Publisher3"));
        addBookToLibrary(createBook("Title4", "Author4","Publisher4"));

        print(getBooks(FieldName.Author.name(),"Author1"));
        print(getBooks(FieldName.Title.name(),"Author1"));
        print(getBooks(FieldName.Publisher.name(),"Publisher2"));
    }
}
