package Ćwiczenia2;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.time.Period;

public class Book {
    private static Set<Book> extent = new HashSet<>();


    private long id;
    private String name;
    private Genre genre;
    private Lang lang;
    private LocalDate publishDate;
    private int borrowCount=0;
    private boolean isAvailable;
    private static long idCounter = 0;
    private Person borrowedBy=null;

    public Book(String name, Genre genre, Lang lang, LocalDate publishDate) {
        this.id = idCounter;
        idCounter++;
        this.name = name;
        this.genre = genre;
        this.lang = lang;
        this.publishDate = publishDate;
        this.isAvailable= true;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new ValidationException("Name must not be empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGenre(Genre genre) {
        if (genre == null) {
            throw new RuntimeException("Genre must not be null ");
        }
        this.genre=genre;
    }

    public Genre getGenre() {
        return genre;
    }
    public void setLang(Lang lang) {
        if (lang == null) {
            throw new RuntimeException("Lang must not be null ");
        }
        this.lang= lang;
    }
    public Lang getLang() {
        return lang;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(LocalDate publishDate) {
        if (publishDate.isBefore(publishDate)) {
            throw new ValidationException("Date is wrong");
        }
        this.publishDate= publishDate;

    }
    public Period getBookAge() {
        return Period.between(publishDate, LocalDate.now());

    }
    public void borrowBook(Person person) {
        if (this.isAvailable==false || person.getBorrowedBook()!=null) {
            throw new ValidationException("sory, you can t borrow this book");
        }
        else {
            this.borrowCount++;
            this.isAvailable=false;
            this.borrowedBy=person;
            person.setBorrowedBook(this);

        }

    }
    public int getBorrowCount() {
        return borrowCount;
    }
    public void placeBack() {
        this.isAvailable=true;
        this.borrowedBy.setBorrowedBook(null);
        this.borrowedBy=null;

    }

}