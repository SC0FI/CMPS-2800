package Practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {

    public static class Book {
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

    public static class Library {
        private List<Book> books;

        public Library() {
            books = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
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
            for (Book book :books) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    result.add(book);
                }
            }
            return result;
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
            for (Book book :books) {
                System.out.println(book.getDetails());
            }
        }
    }

        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            Library library = new Library();
            boolean exit = false;

            library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
            library.addBook(new Book("1984", "George Orwell"));
            library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));

            while(!exit) {
                System.out.println("\nWelcome to the Library Management System");
                System.out.println("1. Add a book");
                System.out.println("2. Display all books");
                System.out.println("3. Search for a book");
                System.out.println("4. Borrow a book");
                System.out.println("5. Return a book");
                System.out.println("6. Exit");

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
                        System.out.println("search by:");
                        System.out.println("1. Title");
                        System.out.println("2. Author");
                        System.out.println("Enter your choice");
                        int searchChoice = scanner.nextInt();
                        scanner.nextLine();

                        if (searchChoice == 1) {
                            System.out.println("Enter book title to search: ");
                            String searchTitle = scanner.nextLine();
                            library.searchByTitle(searchTitle).forEach(book -> System.out.println(book.getDetails()));
                        } else if (searchChoice == 2) {
                            System.out.print("Enter author name to search: ");
                            String searchAuthor = scanner.nextLine();
                            library.searchByAuthor(searchAuthor).forEach(book -> System.out.println(book.getDetails()));
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





                }
            }
        }
    }

