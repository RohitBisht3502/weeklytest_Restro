package com.geekster.Restaurant_model.controller;

import com.geekster.Restaurant_model.entity.Restaurant;
import com.geekster.Restaurant_model.service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    @GetMapping("all")
    public List<Restaurant> getAllRestaurant()
    {
        return restaurantService.getAllRestaurant();
    }
    @PostMapping("all")
    public String addRestaurants(@RequestBody @Valid List<Restaurant> myRestaurant){
        return restaurantService.addRestaurants(myRestaurant);
    }








}
