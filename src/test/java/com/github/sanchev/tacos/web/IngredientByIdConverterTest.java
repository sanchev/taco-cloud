package com.github.sanchev.tacos.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.github.sanchev.tacos.Ingredient;
import com.github.sanchev.tacos.Ingredient.Type;
import com.github.sanchev.tacos.data.IngredientRepository;

public class IngredientByIdConverterTest {

    private IngredientByIdConverter converter;

    @BeforeEach
    public void setup() {
        IngredientRepository ingredientRepo = mock(IngredientRepository.class);
        when(ingredientRepo.findById("AAA"))
                .thenReturn(Optional.of(new Ingredient("AAA", "TEST INGREDIENT", Type.CHEESE)));
        when(ingredientRepo.findById("ZZZ"))
                .thenReturn(Optional.empty());

        this.converter = new IngredientByIdConverter(ingredientRepo);
    }

    @Test
    public void shouldReturnValueWhenPresent() {
        assertThat(converter.convert("AAA"))
                .isEqualTo(new Ingredient("AAA", "TEST INGREDIENT", Type.CHEESE));
    }

    @Test
    public void shouldReturnNullWhenMissing() {
        assertThat(converter.convert("ZZZ")).isNull();
    }

}
