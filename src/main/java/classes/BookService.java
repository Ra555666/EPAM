package classes;

import java.util.ArrayList;

public class BookService {
//    private static Books.Library library = new Books.Library();

//    public static void createNewBook(String authorName, String bookName) {
//        Books.Book book = new Books.Book(authorName, bookName);
//        library.addBook(book);
//    }

//    public static String findBookByAuthor(String authorName) {
//        return library.getBooks().stream()
//                .filter(book -> book.getAuthor().equals(authorName))
//                .findFirst()
//                .get()
//                .toString();
//    }


    public static void printElementsByAuthor(String autor, ArrayList<Book> arrayToPrint) {
        for (Book element : arrayToPrint) {
            if (autor.equals(element.getAuthor()))
                System.out.println(element.toString());
        }
    }

    public static void printElementsByPublisher(String publisher, ArrayList<Book> arrayToPrint) {
        for (Book element : arrayToPrint) {
            if (publisher == element.getPublisher())
                System.out.println(element.toString());
        }

    }

    public static void printElementsPublicAfterYear(int yearOfPublish, ArrayList<Book> arrayToPrint) {
        for (Book element : arrayToPrint) {
            if (yearOfPublish > element.getYearOfPublish()) {
                System.out.println(element.toString());
            }
        }
    }


}
