package com.example.Tamagotchi_Towers.models.animals;

import com.example.Tamagotchi_Towers.models.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "animals")
public abstract class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "animal_name")
    private String animalName;

    @Column(name = "health")
    private int health;

    @Column(name = "happiness")
    private int happiness;

    @Column(name = "cleanliness")
    private int cleanliness;

    @Column(name = "fitness")
    private int fitness;

    @Column(name = "hunger")
    private int hunger;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnoreProperties({"animals"})
    private User user;

    public Animal(String animalName, int health, int happiness, int cleanliness,
                  int fitness, int hunger, User user){
        this.animalName = animalName;
        this.health = health;
        this.happiness = happiness;
        this.cleanliness = cleanliness;
        this.fitness = fitness;
        this.hunger = hunger;
        this.user = user;
    }

    public Animal(){

    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public int getFitness() {
        return fitness;
    }

    public int getHunger() {
        return hunger;
    }
}
