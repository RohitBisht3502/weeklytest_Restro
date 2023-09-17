package com.geekster.Restaurant_model.service;

import com.geekster.Restaurant_model.entity.Restaurant;
import com.geekster.Restaurant_model.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// or we can write also @Componenet.
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public List<Restaurant> getAllRestaurant(){
        return restaurantRepo.getRestaurantList();
    }
    public String addRestaurants(List<Restaurant> myRestaurant) {
        getAllRestaurant().addAll(myRestaurant);
        return myRestaurant.size()+" Restaurants were added";
    }

}
