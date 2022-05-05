package com.demo.dao;

import com.demo.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {

    List<Book> findAll();

    Book findById(int id);

    public void updatePriceById(@Param(value = "id") int id, @Param("price") int price);

}
