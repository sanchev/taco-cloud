package com.github.sanchev.tacos.data;

import com.github.sanchev.tacos.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IngredientRepository 
         extends MongoRepository<Ingredient, String> {
  
}
