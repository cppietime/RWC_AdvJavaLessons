package edu.njit.rwc.topic_05_generics;

import edu.njit.rwc.topic_04_interfaces.DogPet;
import edu.njit.rwc.topic_04_interfaces.RockPet;

public class Main {

    public static void main(String[] args){
        Kennel<DogPet> dogKennel = new Kennel<>(5); // This kennel only accepts pet dogs
        dogKennel.deposit(new DogPet());
        dogKennel.deposit(new DogPet());
        dogKennel.deposit(new DogPet());
        dogKennel.petAll();
        dogKennel.withdraw(1).bark();
        dogKennel.petAll();

        Kennel<RockPet> rocks = new Kennel<>(5); // This kennel only accepts pet rocks
        rocks.deposit(new RockPet());
        rocks.deposit(new RockPet());
        rocks.petAll();
        rocks.withdraw(0).pet();
        rocks.petAll();
    }

}
