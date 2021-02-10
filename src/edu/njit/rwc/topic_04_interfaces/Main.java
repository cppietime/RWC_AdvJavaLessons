package edu.njit.rwc.topic_04_interfaces;

import edu.njit.rwc.topic_02_classes.Dog;

public class Main {

    public static void main(String[] args){
        Pet dog = new DogPet();
        dog.pet();
        ((Dog)dog).bark(); // Because this value is a subclass of Dog, we can cast it to Dog to access Dog's methods

        Pet rock = new RockPet();
        rock.pet(); // We would not be able to cast this to Dog
    }

}
