package Ćwiczenia2;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Person {

    private String name;
    private String surname;
    private LocalDate date;
    private int age;
    private Book borrowedBook=null;

    public Person(String name, String surname) {
        this.name=name;
        this.surname= surname;
    }
    public String getName () {
        return name;
    }

    public void setName (String name){
        if (name == null || name.isEmpty()) {
            throw new ValidationException("Name must not be empty");
        }
        this.name = name;
    }

    public String getSurname () {
        return surname;
    }
    public void setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new ValidationException("Surame must not be empty");
        }
        this.surname= surname;
    }

    public  LocalDate getDate() { return date; }

    public void setDate(LocalDate date) {
        if (date == null || date.isAfter(LocalDate.now())) {
            throw new RuntimeException("Date is wrong");
        }
        this.date= date;
    }
    public void publishBook() {
        //     Book b1 = new Book(String[] arg);
    }

    public Book getBorrowedBook() { return this.borrowedBook; }

    public void setBorrowedBook(Book book) {
        this.borrowedBook = book;
    }


}
