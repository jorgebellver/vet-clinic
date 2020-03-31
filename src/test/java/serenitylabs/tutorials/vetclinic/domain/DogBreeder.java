package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class DogBreeder implements WithBreed, ofColour {

    private String name;
    private String breed;
    private String favouriteFood;
    private String colour;
    private LocalDateTime dateOfBirth;

    public static DogBreeder aDog() {
        return new DogBreeder();
    }

    public static DogBreeder aSmallDog() {
        return aDog().ofBreed("Poodle");
    }

    public DogBreeder called(String name) {
        this.name = name;
        return this;
    }

    public static DogBreeder aLargeDog() {
        return aDog().ofBreed("Labrador");
    }

    public DogBreeder ofBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public DogBreeder withFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
        return this;
    }

    public DogBreeder ofColour(String colour) {
        this.colour = colour;
        return this;
    }

    public Dog bornOn(LocalDateTime dateOfBirth) {
        return new Dog(name, breed, dateOfBirth, favouriteFood, colour);
    }
}