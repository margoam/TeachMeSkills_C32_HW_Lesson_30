package com.teachmeskills.training.lesson_31.game;

import com.teachmeskills.training.lesson_31.game.factory.character_factory.CharacterFactory;
import com.teachmeskills.training.lesson_31.game.factory.env_factory.EnvFactory;
import com.teachmeskills.training.lesson_31.game.model.character.Character;
import com.teachmeskills.training.lesson_31.game.model.environment.Environment;

import java.util.Scanner;

public class Task2 {

    public static void RunTask2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your character (Mage, Warrior, Archer): ");
        String characterType = scanner.nextLine();

        System.out.println("Choose your environment (Desert, Forest, City): ");
        String environmentType = scanner.nextLine();

        try {
            Character character = CharacterFactory.createCharacter(characterType);
            Environment environment = EnvFactory.createEnvironment(environmentType);

            System.out.println(character.getDescription() + " is in " + environment.getDescription() + ".");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
