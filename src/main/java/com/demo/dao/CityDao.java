package com.demo.dao;

import com.demo.entity.City;

public interface CityDao {
    City findById(int id);
    City findById2(int id);
}
