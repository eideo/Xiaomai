package com.topschool.xm.dao.orderfood;

import com.topschool.xm.model.orderfood.Restaurant;

import java.util.List;

public interface RestaurantMapper {

    boolean insert(Restaurant restaurant);

    Restaurant getById(Integer id);

    List<Restaurant> getAll();

    boolean deleteById(Integer id);

    boolean update(Restaurant restaurant);
}
