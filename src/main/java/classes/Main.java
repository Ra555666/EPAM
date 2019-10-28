package classes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        ArrayList list = library.creatingListOfBooks();
        BookService.printElementsByAuthor("Gogol", list);
        BookService.printElementsByPublisher("ast", list);
        BookService.printElementsPublicAfterYear(1986, list);
    }
}
