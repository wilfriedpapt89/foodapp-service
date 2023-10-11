package com.crostsoft.foodapp.service;

import com.crostsoft.foodapp.entity.Meal;
import com.crostsoft.foodapp.repository.MealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MealServiceImpl implements MealService{

    private final MealRepository mealRepository;
    @Override
    public Meal findById(Long idMeal) {
        return null;
    }

    @Override
    public List<Meal> getAll() {
        return mealRepository.findAll();
    }

    @Override
    public Meal create(Meal meal) {
        return null;
    }

    @Override
    public Meal update(Meal meal) {
        return null;
    }

    @Override
    public void deleteById(Long idMeal) {

    }
}
