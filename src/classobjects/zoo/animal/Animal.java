package classobjects.zoo.animal;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private AnimalType animalType;
    private List<String> possibleFoodToEat;

    private String sound;

    public Animal(String name, AnimalType animalType, String favoriteFood, String sound) {
        this.name = name;
        this.animalType = animalType;

        possibleFoodToEat = new ArrayList<>();
        possibleFoodToEat.add(favoriteFood);

        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(sound +"!!!!!!");
    }

    public boolean chewFood(String food) {
        return possibleFoodToEat.contains(food);
    }

    public String getName() {
        return name;
    }
}
