package Backend_Week1;

import java.util.Scanner;


public class Library1 {
    public static void main(String[] args) {
        int ch =0;
        Scanner sc = new Scanner(System.in);
        BookManager manager = new BookManager();
        do{
            System.out.print("""
                                    
                    ---Welcome to ABC Library---
                    Please Select an option:
                    1. Add book
                    2. Search book
                    3. View books
                    9. Exit                        
                                   
                    Your Choice: """);
            ch = Integer.parseInt(sc.nextLine());

            try {
                switch (ch) {
                    case 1 ->//Add book
                    {
                        System.out.println("Please enter the book title:");
                        String title = sc.nextLine();
                        System.out.println("Please enter the book author:");
                        String author = sc.nextLine();
                        if(manager.addBook(new Book(title,author))) System.out.println("Book added successfully");
                    }
                    case 2 ->//Search book
                    {
                        System.out.println("Please enter the book name:");
                        String book = sc.nextLine();
                        if(manager.searchBook(book)) System.out.println("Requested book is available");
                        else System.out.println("Requested book is not available");
                    }
                    case 3 ->//Search book
                            manager.displayBookList();
                    case 9 ->//Exit
                            System.out.println();
                    default -> System.out.println("Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }while (ch!=9);
        System.out.println("\nThank you for using ABC Library Portal.");
    }
}