package designpatterns.structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);
        String printedMaterial = moviePrinter.print(printFormatter);
        System.out.println(printedMaterial);
        Formatter htmlFormatter = new HtmlFormatter();
        String htmlMaterial = moviePrinter.print(htmlFormatter);
        System.out.println(htmlMaterial);

        Book book = new Book();
        book.setClassification("history");
        book.setAuthor("Jane Austin");
        book.setPages("335");
        book.setTitle("Emma");

        Printer bookPrinter = new BookPrinter(book);
        String printedMaterial2 = bookPrinter.print(printFormatter);
        System.out.println(printedMaterial2);
        String htmlMaterial2 = bookPrinter.print(htmlFormatter);
        System.out.println(htmlMaterial2);

    }
}
