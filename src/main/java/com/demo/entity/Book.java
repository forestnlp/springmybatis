package com.demo.entity;

public class Book {

    private String bookname;
    private Integer id;
    private int price;

    public Book() {
    }

    public Book(String bookname, Integer id, int price) {
        this.bookname = bookname;
        this.id = id;
        this.price = price;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
