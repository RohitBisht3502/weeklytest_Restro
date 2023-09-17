package com.geekster.Restaurant_model.entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    @NotBlank
    private String restaurantName;
    @NotBlank
    private String restaurantAddress;
    @Email(message = "not a valid email")
    private String restaurantEmail;
    @Size(min=10,max=10)
    private Integer restaurantNumber;

    private Speciality restaurantSpeciality;
    @NotNull
    private Integer restaurantTotalStaff;
    @NotNull
    private Integer restaurantRating;

}
