package com.geekster.Restaurant_model.repo;

import com.geekster.Restaurant_model.entity.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RestaurantFactory
{
    @Bean
    List<Restaurant> getRestaurantList(){
        return new ArrayList<>();
    }
}
