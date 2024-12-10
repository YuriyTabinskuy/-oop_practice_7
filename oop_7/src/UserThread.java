public class UserThread implements Runnable {
    private final Library library;
    private final String userName;

    public UserThread(Library library, String userName) {
        this.library = library;
        this.userName = userName;
    }

    @Override
    public void run() {
        library.borrowBook(userName);
    }
}
