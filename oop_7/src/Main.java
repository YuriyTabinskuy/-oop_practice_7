public class Main {
    public static void main(String[] args) {

        
        Library library = new Library("Java Programming", 3);

       
        Thread user1 = new Thread(new UserThread(library, "User 1"));
        Thread user2 = new Thread(new UserThread(library, "User 2"));
        Thread user3 = new Thread(new UserThread(library, "User 3"));
        Thread user4 = new Thread(new UserThread(library, "User 4"));


        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}
