import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    private static ArrayList<Book> books = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        books.add(new Book("To Kill a Mockingbird"));
        books.add(new Book("1984"));
        books.add(new Book("The Great Gatsby"));
        books.add(new Book("The Catcher in the Rye"));
        
        while (!exit) {
            System.out.println("Library Management System");
            System.out.println("1. View Available Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    viewAvailableBooks();
                    break;
                case 2:
                    System.out.print("Enter the title of the book to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    borrowBook(borrowTitle);
                    break;
                case 3:
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    returnBook(returnTitle);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        scanner.close();
    }

    private static void viewAvailableBooks() {
        System.out.println("Available Books: ");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle());
            }
        }
    }

    private static void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    private static void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

class Book {
    private String title;
    private boolean isAvailable;
    
    public Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }
    
    public String getTitle() {
        return title;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You borrowed \"" + title + "\".");
        } else {
            System.out.println("\"" + title + "\" is currently unavailable.");
        }
    }
    public void returnBook() {
        isAvailable = true;
        System.out.println("You returned \"" + title + "\".");
    }
}
