package com.github.sanchev.tacos.data;

import org.springframework.data.repository.CrudRepository;

import com.github.sanchev.tacos.Ingredient;

public interface IngredientRepository 
         extends CrudRepository<Ingredient, String> {
  
}
