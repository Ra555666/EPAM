package classes;

import java.util.ArrayList;

public class BookService {
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
