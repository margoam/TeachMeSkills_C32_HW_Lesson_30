package com.teachmeskills.training.lesson_31.pizza_app.model;

import lombok.Builder;

@Builder
public class Pizza {

    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;
    private boolean olives;

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", mushrooms=" + mushrooms +
                ", olives=" + olives +
                '}';
    }
}
