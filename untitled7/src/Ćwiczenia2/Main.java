package Ćwiczenia2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Book b1 = new Book(null, Genre.Fantasy, Lang.Polish, LocalDate.of(2011, 05, 22));
        Book b2 = new Book("du4di", Genre.Fantasy, Lang.Ukrainian, LocalDate.of(2001, 01, 02));
        Book b3 = new Book("dobdob", Genre.Comics, Lang.English, LocalDate.of(2001, 01, 02));
        Book b4 = new Book("boz", Genre.Adventure, Lang.Japanese, null);
        Person p1 = new Person("Sylwester", "Wardęga");
        Person p2 = new Person("Marek", "Goc");
        b3.setGenre(Genre.Classic);
        System.out.println(b1.getName());
        System.out.println(b3.getBookAge());
        System.out.println(b1.getId());
     //   b3.setName("");
        System.out.println(b2.getId());
        System.out.println(b3.getId());
        System.out.println(b4.getPublishDate());
        b4.setPublishDate(LocalDate.of(2001, 01, 02));
        System.out.println(b4.getPublishDate());
        b4.borrowBook(p1);
        System.out.println(b4.getBorrowCount());
        b3.borrowBook(p2);
        System.out.println(b4.getBorrowCount());
        System.out.println(b3.getBorrowCount());
        System.out.println(b3.getBorrowCount());

    }
}