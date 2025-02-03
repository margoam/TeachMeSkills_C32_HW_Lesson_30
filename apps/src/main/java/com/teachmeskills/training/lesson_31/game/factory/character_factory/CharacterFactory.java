package com.teachmeskills.training.lesson_31.game.factory.character_factory;

import com.teachmeskills.training.lesson_31.game.model.character.Archer;
import com.teachmeskills.training.lesson_31.game.model.character.Mage;
import com.teachmeskills.training.lesson_31.game.model.character.Warrior;
import com.teachmeskills.training.lesson_31.game.model.character.Character;

public class CharacterFactory {

    public static Character createCharacter(String type) {
        return switch (type.toLowerCase()) {
            case "mage" -> new Mage();
            case "warrior" -> new Warrior();
            case "archer" -> new Archer();
            default -> throw new IllegalArgumentException("Unknown character: " + type);
        };
    }
}
