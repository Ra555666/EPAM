package Books;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        ArrayList<Book> list = library.creatingListOfBooks();
        BookService service = new BookService();
        service.printElementsByAuthor("Gogol",list);
        service.printElementsByPublisher("ast", list);
        service.printElementsPublicAfterYear(1986,list);


//        Books.BookService.createNewBook("Kola","Gav");
//        Books.BookService.createNewBook("Kola1","Gav1");
//        Books.BookService.createNewBook("Kola2","Gav2");
//        System.out.println( Books.BookService.findBookByAuthor("Gav"));
    }
}
