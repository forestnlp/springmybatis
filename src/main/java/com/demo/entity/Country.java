package com.demo.entity;

import java.util.Date;

public class Country {
    private int country_id;
    private String country;

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    private Date last_update;

    @Override
    public String toString() {
        return "Country{" +
                "id=" + country_id +
                ", country='" + country + '\'' +
                ", last_update=" + last_update +
                '}';
    }
}
