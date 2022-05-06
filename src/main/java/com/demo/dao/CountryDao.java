package com.demo.dao;

import com.demo.entity.City;
import com.demo.entity.Country;

import java.util.List;

public interface CountryDao {
    Country findById(int id);
}
