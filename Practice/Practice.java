package Practice;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {

    public static class Book implements Serializable {  // Make Book Serializable
        private String title;
        private String author;
        private boolean isAvailable;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.isAvailable = true;
        }

        public String getDetails() {
            return "title: " + title + ", Author: " + author + ", Available: " + isAvailable;
        }

        public void printFancyDetails() {
            System.out.println("Title: " + title + "\n    Author: " + author + "\n    Available: " + isAvailable + "\n");
        }

        public void borrowBook() {
            if (isAvailable) {
                isAvailable = false;
            } else {
                System.out.println("Sorry this book is unavailable");
            }
        }

        public void returnBook() {
            isAvailable = true;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public boolean isAvailable() {
            return isAvailable;
        }
    }

    public static class Library implements Serializable { // Make Library Serializable
        private List<Book> books;

        public Library() {
            books = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
        }

        public void removeBook(Book book) {
            books.remove(book);
        }

        public List<Book> searchByTitle(String title) {
            List<Book> result = new ArrayList<>();
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    result.add(book);
                }
            }
            return result;
        }

        public List<Book> searchByAuthor(String author) {
            List<Book> result = new ArrayList<>();
            for (Book book : books) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    result.add(book);
                }
            }
            return result;
        }

        public Book getBook(String title) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                    return book;
                }
            }
            return null;
        }

        public Book borrowBook(String title) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                    book.borrowBook();
                    return book;
                }
            }
            System.out.println("Sorry, the book is either unavailable or not found.");
            return null;
        }

        public void returnBook(Book book) {
            book.returnBook();
        }

        public void displayBooks() {
            System.out.println("Available Books:");
            for (Book book : books) {
                book.printFancyDetails();
            }
        }

        // Save the Library to a file
        public void saveLibrary(String filename) {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
                out.writeObject(this);
                System.out.println("Library saved!");
            } catch (IOException e) {
                System.out.println("Error saving the library.");
                e.printStackTrace();
            }
        }

        // Load the Library from a file
        public static Library loadLibrary(String filename) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
                return (Library) in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error loading the library, creating a new one.");
                return new Library();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String libraryFilename = "library.dat";
        Library library = Library.loadLibrary(libraryFilename); // Load the library from file
        // Pre-populate with some books if library is empty
        if (library.books.isEmpty()) {
            library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
            library.addBook(new Book("1984", "George Orwell"));
            library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        }

        boolean exit = false;

        while (!exit) {
            System.out.println("\nWelcome to the Library Management System");
            System.out.println("1. Add a book");
            System.out.println("2. Display all books");
            System.out.println("3. Search for a book");
            System.out.println("4. Borrow a book");
            System.out.println("5. Return a book");
            System.out.println("6. Delete a book");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    Book newbook = new Book(title, author);
                    library.addBook(newbook);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:
                    System.out.println("Search by:");
                    System.out.println("1. Title");
                    System.out.println("2. Author");
                    System.out.println("Enter your choice");
                    int searchChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (searchChoice == 1) {
                        System.out.println("Enter book title to search: ");
                        String searchTitle = scanner.nextLine();
                        library.searchByTitle(searchTitle).forEach(Book::printFancyDetails);
                    } else if (searchChoice == 2) {
                        System.out.print("Enter author name to search: ");
                        String searchAuthor = scanner.nextLine();
                        library.searchByAuthor(searchAuthor).forEach(Book::printFancyDetails);
                    }
                    break;

                case 4:
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    Book borrowedBook = library.borrowBook(borrowTitle);
                    if (borrowedBook != null) {
                        System.out.println("You have borrowed: " + borrowedBook.getTitle());
                    }
                    break;

                case 5:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    List<Book> booksToReturn = library.searchByTitle(returnTitle);
                    if (!booksToReturn.isEmpty()) {
                        library.returnBook(booksToReturn.get(0));
                    }
                    break;

                case 6:
                    System.out.println("Please enter title of book you'd like to delete.");
                    String bookname = scanner.nextLine();
                    if (library.getBook(bookname) != null) {
                        library.removeBook(library.getBook(bookname));
                        System.out.println("Book succesfully deleted: " + bookname);
                    } else {
                        System.out.println("Book cannot be found, Please try again.");
                    }
                    break;

                case 7:
                    library.saveLibrary(libraryFilename);
                    exit = true;
                    break;

            }
        }

        scanner.close();
    }
}
