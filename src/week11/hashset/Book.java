package week11.hashset;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public Book(String title, String author, int price) {
        super();
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return "Title: " + this.title + ", Author: " + this.author + ", Price: " + this.price;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && 
               Objects.equals(title, book.title) && 
               Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(this.title, this.author, this.price);
    }
}
