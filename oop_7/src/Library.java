public class Library {
    private String bookName;
    private int availableCopies;


    public Library(String bookName, int initialCopies) {
        this.bookName = bookName;
        this.availableCopies = initialCopies;
    }


    public synchronized void borrowBook(String userName) {
        System.out.println(userName + " намагається взяти книгу: " + bookName);

        if (availableCopies > 0) {
            availableCopies--;
            System.out.println(userName + " успішно взяв книгу " + bookName + ". Залишилось копій: " + availableCopies);
        } else {
            System.out.println(userName + " не зміг взяти книгу " + bookName + ". Книги більше немає в наявності.");
        }
    }
}
