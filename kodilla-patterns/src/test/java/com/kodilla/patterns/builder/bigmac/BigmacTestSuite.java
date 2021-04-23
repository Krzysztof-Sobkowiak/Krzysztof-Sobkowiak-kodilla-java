package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test Builder - Bigmac")
public class BigmacTestSuite {

    @DisplayName("Test Of Composing My Own Bigmac")
    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun(Bun.WITH_SESAME)
                .burgers(Burgers.BEEF_CHOP_QUANTITY_3)
                .sauce(Sauce.BARBECUE)
                .ingredient(Ingredients.LETTUCE)
                .ingredient(Ingredients.BACON)
                .ingredient(Ingredients.ONION)
                .ingredient(Ingredients.CHEESE)
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(4, howManyIngredients);

    }
}