# TeachMeSkills_C32_HW_Lesson_30

## The following is implemented:
1. Create a Pizza Ordering App Using the Builder Pattern
Description: Create a pizza ordering app that allows users to customize their orders. Apply the Builder pattern to simplify the process of creating a pizza with different ingredients. Consider how you can organize the interface for selecting options and how this will affect the final order.

2. Design a small game in which the player can select characters with different abilities and a location using the Factory pattern. Create a method that will generate descriptions of the situation depending on the selected character and location.
For example, if the user selects:
Character: Mage
Terrain: Desert
then we will see:
"A mage with a long robe and a magic wand is in a hot desert with sand dunes and rare plants."

Requirements:
Characters: The player should be able to choose from different character classes (e.g. mage, warrior, shooter), each with unique abilities.
Environment: The game should include different types of terrain (e.g. forest, desert, city).

## Builder Pattern

Best for:

Creating complex objects step by step.
When an object has many optional parameters or configurations.
When you want readable and flexible object creation.
Example Use Case:
Imagine a pizza ordering system, where customers can choose multiple toppings, size, crust type, and extras. Using the Builder Pattern, we can construct a pizza with different combinations without needing multiple constructors.

Benefits:

- Improves readability – Pizza.builder().size("Large").cheese(true).build();
- Reduces the need for multiple constructors (avoids constructor explosion).
- Ensures immutability – once built, the object remains unchanged.

## Factory Pattern 

Best for:

When you need to create objects dynamically based on input.
When you want to centralize object creation instead of spreading new calls across the code.
When the exact type of object is unknown at compile time.
Example Use Case:
A game character selection screen, where users choose between a Mage, Warrior, or Archer. Instead of writing new Mage(), new Warrior(), etc., the Factory Pattern allows creating objects dynamically with a simple method call:

Character character = CharacterFactory.createCharacter("Mage");
Benefits:

- Encapsulates object creation – reduces code duplication.
- Simplifies maintenance – adding new types doesn’t break existing code.
- Improves flexibility – objects are created based on runtime conditions.
