package com.github.sanchev.tacos.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import com.github.sanchev.tacos.Ingredient;
import com.github.sanchev.tacos.data.IngredientRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IngredientByIdConverterTest {

  private IngredientByIdConverter converter;

  @BeforeEach
  public void setup() {
    IngredientRepository ingredientRepo = mock(IngredientRepository.class);
    when(ingredientRepo.findById("AAAA"))
        .thenReturn(Optional.of(new Ingredient("AAAA", "TEST INGREDIENT", Ingredient.Type.CHEESE)));
    when(ingredientRepo.findById("ZZZZ"))
        .thenReturn(Optional.empty());
    
    this.converter = new IngredientByIdConverter(ingredientRepo);
  }
  
  @Test
  public void shouldReturnValueWhenPresent() {
    Assertions.assertThat(converter.convert("AAAA"))
        .isEqualTo(new Ingredient("AAAA", "TEST INGREDIENT", Ingredient.Type.CHEESE));
  }

  @Test
  public void shouldReturnNullWhenMissing() {
    Assertions.assertThat(converter.convert("ZZZZ")).isNull();
  }

}
