package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 100);
        Book book2 = new Book("Head First", 200);
        Book book3 = new Book("Effective java", 300);
        Book book4 = new Book("Философия Java", 400);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b);
        }
        books[0] = book3;
        books[3] = book1;

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b);
        }

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            if (b.getName().equals("Clean code")) {
                System.out.println(b);
            }
        }
    }


}
