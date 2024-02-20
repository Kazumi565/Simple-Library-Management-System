import java.util.Scanner;

class Book {
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

class Library {
    ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.title + ", Author: " + book.author + ", ISBN: " + book.isbn);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Display all books");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter book details:");
                    System.out.print("Title: ");
                    String title = scanner.next();
                    System.out.print("Author: ");
                    String author = scanner.next();
                    System.out.print("ISBN: ");
                    String isbn = scanner.next();

                    Book newBook = new Book(title, author, isbn);
                    library.addBook(newBook);
                    break;

                case 2:
                    System.out.println("Enter ISBN of the book to remove:");
                    String isbnToRemove = scanner.next();
                    Book bookToRemove = null;

                    for (Book book : library.books) {
                        if (book.isbn.equals(isbnToRemove)) {
                            bookToRemove = book;
                            break;
                        }
                    }

                    if (bookToRemove != null) {
                        library.removeBook(bookToRemove);
                        System.out.println("Book removed successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.println("Books in the library:");
                    library.displayBooks();
                    break;

                case 4:
                    System.out.println("Exiting the Library Management System.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid action.");
            }
        }
    }
}
