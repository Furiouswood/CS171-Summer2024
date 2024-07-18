package Lab_3.BookAPI;

public interface Scanable {
    void scan();

    void scanNextPage();

    void scanPreviousPage();

    default void scanningStarted() {
        System.out.println("Scanning started");
    }

    default void scanningFinished() {
        System.out.println("Scanning finished");
    }
}
