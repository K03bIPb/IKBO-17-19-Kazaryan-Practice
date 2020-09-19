package ru.rtu.main.Practice3;

public class BookTest {
    public static void main(String[] args) {
        String name = args[0];
        String author = args[1];
        double a = Double.parseDouble(args[2]);
        double b = Double.parseDouble(args[3]);
        int publication_date = (int) a;
        int pop_level = (int) b;

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", "J.K.Rowling", 1997, 10);
        Book book2 = new Book("The Call of the Wild", "Jack London", 1903, 8);
        Book book3 = new Book(name, author, publication_date, pop_level);

        System.out.println(book1.toString());

        System.out.println(book2.getPublicationYear());

        System.out.println(book3.getAuthor());

    }
}
