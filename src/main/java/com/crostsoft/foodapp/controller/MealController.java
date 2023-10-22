package com.crostsoft.foodapp.controller;

import com.crostsoft.foodapp.entity.Meal;
import com.crostsoft.foodapp.service.MealService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meals")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
public class MealController {


    private final MealService mealService;
    @GetMapping("/all")
    public ResponseEntity<List<Meal>> getAllMeals(){

        Thread local = Thread.currentThread();
           synchronized (local){
               try {
                   local.wait(5_000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }


        return new ResponseEntity<>(mealService.getAll(), HttpStatus.OK);
    }
}
