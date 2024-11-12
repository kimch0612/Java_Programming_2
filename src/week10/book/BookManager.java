package week10.book;

import java.util.TreeSet;

public class BookManager {
    TreeSet<Book> books = new TreeSet<Book>();

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            System.out.println(book.getTitle() + " 추가 완료");
        }
        else {
            System.out.println("이미 존재하는 책입니다.");
        }
    }
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("책 목록이 비어있습니다.");
            return;
        }
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println(title + " 책이 존재합니다.");
            }
        }
        System.out.println(title + " 책을 찾지 못했습니다.");
    }
    public void updateBook(String title, String author, int price) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.setAuthor(author);
                book.setPrice(price);
                System.out.println(title + " 의 정보를 수정하였습니다.");
                return;
            }
        }
        System.out.println(title + " 책을 찾지 못했습니다.");
    }
    public void removeBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println(book.getTitle() + " 책 삭제 완료");
                books.remove(book);
                return;
            }
        }
        System.out.println(title + " 책은 존재하지 않습니다.");
    }
}
