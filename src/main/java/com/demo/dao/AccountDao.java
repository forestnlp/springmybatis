package com.demo.dao;

import com.demo.entity.Account;

import java.util.List;

public interface AccountDao {

    List<Account> findAll();

    public int insertOne(Account account);

    public int insertOneWithPK(Account account);

}
