package Lab_3.BookAPI;

class Main {

    public static void main(String[] args) {
        // the following code is an mock example which gives you an idea of getting a
        // book from an API and using it in your application
        BookAPI bookAPI = new BookAPI();
        String id = "1"; // In a real application, this might be input by the user

        Book book = (Book) bookAPI.getBook(id);

        String title = (String) book.getTitle();
        String author = (String) book.getAuthor();
        Integer year = (Integer) book.getYear();

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);

        // Book:
        // void read(){
        // readingStarted();
        // System.out.println("reading book ...");
        // readingFinished();
        // }
        book.read();
        book.nextPage();
        book.previousPage();

        book.scan();
        book.scanNextPage();
        book.scanPreviousPage();
    }
}