package com.example.Tamagotchi_Towers.models.animals;

import com.example.Tamagotchi_Towers.models.User;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Dragon extends Animal{

    private AnimalType animalType;
    private ArrayList images;

    public Dragon(String animalName, int health, int happiness, int cleanliness,
                  int fitness, int hunger, User user){
        super(animalName, health, happiness, cleanliness, fitness, hunger, user);
        this.animalType = AnimalType.DRAGON;
        this.images = new ArrayList();
    }

    public Dragon(){

    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public ArrayList getImages() {
        return images;
    }
}
