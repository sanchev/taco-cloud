package com.github.sanchev.tacos.data;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import com.github.sanchev.tacos.Ingredient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IngredientRepositoryTests {

  @Autowired
  IngredientRepository ingredientRepo;
  
  @Test
  public void findById() {
    Optional<Ingredient> flto = ingredientRepo.findById("FLTO");
    assertThat(flto.isPresent()).isTrue();
    assertThat(flto.get()).isEqualTo(new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP));
    
    Optional<Ingredient> xxxx = ingredientRepo.findById("XXXX");
    assertThat(xxxx.isEmpty()).isTrue();

  }
  
}
