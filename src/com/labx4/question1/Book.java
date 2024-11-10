package com.labx4.question1;

import java.util.ArrayList;

public class Book {
    private int bookId;
    private String bookName;
    private String autherName;

//    parameterize cunstucture
    public Book(int bookId,String bookName,String autherName){
        this.bookId = bookId;
        this.bookName=bookName;
        this.autherName=autherName;
    }

//    genrating the getter and setter


    public int getBookId() {
        return bookId;
    }

    public Book setBookId(int bookId) {
        this.bookId = bookId;
        return this;
    }

    public String getBookName() {
        return bookName;
    }

    public Book setBookName(String bookName) {
        this.bookName = bookName;
        return this;
    }

    public String getAutherName() {
        return autherName;
    }

    public Book setAutherName(String autherName) {
        this.autherName = autherName;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", autherName='" + autherName + '\'' +
                '}';
    }
}
