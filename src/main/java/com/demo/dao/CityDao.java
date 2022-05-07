package com.demo.dao;

import com.demo.entity.City;

import java.util.List;

public interface CityDao {
    City findById(int id);
    City findById2(int id);
    List<City> findById3(String cityName);
}
