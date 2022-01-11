package com.github.sanchev.tacos.data;

import com.github.sanchev.tacos.Ingredient;
import com.github.sanchev.tacos.Ingredient.Type;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class IngredientRepositoryTests {

    @Autowired
    IngredientRepository ingredientRepo;

    @Test
    public void findById() {
        Optional<Ingredient> flto = ingredientRepo.findById("FLTO");
        assertThat(flto.isPresent()).isTrue();
        assertThat(flto.get()).isEqualTo(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));

        Optional<Ingredient> xxx = ingredientRepo.findById("XXX");
        assertThat(xxx.isEmpty()).isTrue();

    }

}