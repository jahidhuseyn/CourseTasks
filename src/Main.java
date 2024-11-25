public class Main {

    public static void main(String[] args) {
        // Library Management System...

        // Library - Book - User(Istifadeci) -- istifade olunacaq classklar

        // kitabnaxa ucun istifade olunacaq datalar..
        // Library -> Book[] books , int bookCount... int capacity(kitablari saxlayan array olcusu)

        // kitab ucun istifade olunacaq datalar...
        // Book -> int id , String title , String author , String description , String status (yararli / yarasiz)

        // user ucun istifade olunacaq datalar...
        // User -> String name , String username

        Library library = new Library(10); // max kitab tutumu 10 olacaq...

        library.addBook(new Book(1, "Qirmizi-kitab", "Esger", true));

        library.borrowBook(new User("Cahid", "jahid"), 1);

        library.borrowBook(new User("Cavid", "javid"), 1);

        library.deleteBook(1);

        library.borrowBook(new User("Cavid", "javid"), 1);

    }
}