package com.crostsoft.foodapp.bootstrap;

import com.crostsoft.foodapp.entity.Meal;
import com.crostsoft.foodapp.repository.MealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
@RequiredArgsConstructor
public class DummyMeals implements CommandLineRunner {

    private final MealRepository meatRepository;

    @Override
    public void run(String... args) throws Exception {
        Meal meal = Meal.builder().name("Sushi").description("Finest fish and veggies").price(BigDecimal.valueOf(22.99).setScale(2, RoundingMode.HALF_EVEN)).build();
        Meal meal2 = Meal.builder().name("Schnitzel").description("A german specialty!").price(BigDecimal.valueOf(16.5).setScale(2, RoundingMode.HALF_EVEN)).build();
        Meal meal3 = Meal.builder().name("Barbecue Burger").description("American, raw, meaty").price(BigDecimal.valueOf(12.99).setScale(2, RoundingMode.HALF_EVEN)).build();
        Meal meal4 = Meal.builder().name("Green Bowl").description("Healthy...and green...").price(BigDecimal.valueOf(18.99).setScale(2, RoundingMode.HALF_EVEN)).build();

        meatRepository.save(meal);
        meatRepository.save(meal2);
        meatRepository.save(meal3);
        meatRepository.save(meal4);


    }
}
