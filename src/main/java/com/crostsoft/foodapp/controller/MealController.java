package com.crostsoft.foodapp.controller;

import com.crostsoft.foodapp.entity.Meal;
import com.crostsoft.foodapp.service.MealService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/meals")
@RequiredArgsConstructor
public class MealController {


    private final MealService mealService;
    @GetMapping("/all")
    public ResponseEntity<List<Meal>> getAllMeals(){
        return new ResponseEntity<>(mealService.getAll(), HttpStatus.OK);
    }
}
