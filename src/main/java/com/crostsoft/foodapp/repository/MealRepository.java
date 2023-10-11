package com.crostsoft.foodapp.repository;

import com.crostsoft.foodapp.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal,Long> {
}
