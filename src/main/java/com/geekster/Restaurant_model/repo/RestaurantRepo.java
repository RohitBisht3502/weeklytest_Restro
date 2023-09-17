package com.geekster.Restaurant_model.repo;

import com.geekster.Restaurant_model.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // we can write also component but repository is well good
public class RestaurantRepo {
    @Autowired
    private List<Restaurant> restaurantList;

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }


}
