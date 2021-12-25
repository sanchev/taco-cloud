package com.github.sanchev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void shouldCreateMain() {
        Main main = new Main();
        Assertions.assertNotNull(main);
    }

}