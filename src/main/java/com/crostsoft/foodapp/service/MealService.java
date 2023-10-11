package com.crostsoft.foodapp.service;

import com.crostsoft.foodapp.entity.Meal;

import java.util.List;

public interface MealService {
    Meal findById(Long idMeal);
    List<Meal> getAll();
    Meal create(Meal meal);
    Meal update(Meal meal);
    void deleteById(Long idMeal);
}
