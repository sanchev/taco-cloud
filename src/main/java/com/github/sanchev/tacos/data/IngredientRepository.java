package com.github.sanchev.tacos.data;

import com.github.sanchev.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> { }