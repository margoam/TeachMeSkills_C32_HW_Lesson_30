package com.teachmeskills.training.lesson_31.pizza_app.builder;

import com.teachmeskills.training.lesson_31.pizza_app.model.Pizza;

public class PizzaCreation {

    public static void createPizza() {
        Pizza pizza1 = Pizza.builder()
                .size("huge")
                .cheese(true)
                .pepperoni(true)
                .build();

        Pizza pizza2 = Pizza.builder()
                .size("middle")
                .mushrooms(true)
                .olives(true)
                .build();

        Pizza pizza3 = Pizza.builder()
                .size("small")
                .build();

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }
}
