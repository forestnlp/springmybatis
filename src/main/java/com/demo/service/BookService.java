package com.demo.service;

import com.demo.dao.BookDao;
import com.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {
    
    @Autowired
    private BookDao bookDao;
    
    public List<Book> findAll(){
        return bookDao.findAll();
    }

    @Transactional
    public void transferAccounts(int id1,int id2,int price){
        Book book1 = bookDao.findById(id1);
        Book book2 = bookDao.findById(id2);
        int price1 = book1.getPrice();
        int price2 = book2.getPrice();
        bookDao.updatePriceById(1,price1-price);
        //模拟抛出异常
        int a = 1/0;
        bookDao.updatePriceById(2,price2+price);
    }

}
