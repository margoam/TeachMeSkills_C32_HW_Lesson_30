package com.teachmeskills.training.lesson_31.game.factory.env_factory;

import com.teachmeskills.training.lesson_31.game.model.environment.City;
import com.teachmeskills.training.lesson_31.game.model.environment.Desert;
import com.teachmeskills.training.lesson_31.game.model.environment.Environment;
import com.teachmeskills.training.lesson_31.game.model.environment.Forest;

public class EnvFactory {

    public static Environment createEnvironment(String type) {
        return switch (type.toLowerCase()) {
            case "desert" -> new Desert();
            case "forest" -> new Forest();
            case "city" -> new City();
            default -> throw new IllegalArgumentException("Unknown environment type: " + type);
        };
    }
}
