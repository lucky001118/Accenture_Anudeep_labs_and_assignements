package com.labx4.question1;

import java.util.ArrayList;

public class BookCollection {
    public static void main(String[] args) {
        //creating the Arraylist of books that has generic type Book
        ArrayList<Book> books = new ArrayList<>();

        //adding the books
        books.add(new Book(1,"Lucifer is inocent","unknone"));
        books.add(new Book(2,"fundamentls of C","balagoswami"));
        books.add(new Book(101, "The Lord of the Rings", "J.R.R. Tolkien"));
        books.add(new Book(102, "Pride and Prejudice", "Jane Austen"));
        books.add(new Book(103, "To Kill a Mockingbird", "Harper Lee"));

        //display all the books list
        System.out.println(books);

        System.out.println();
        System.out.println("Printing the books one by one: ");
        //printing the all books informa
        for (Book book : books) {
            System.out.println(book.toString());
        }

    }
}