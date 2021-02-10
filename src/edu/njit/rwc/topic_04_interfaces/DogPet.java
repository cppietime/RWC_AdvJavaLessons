package edu.njit.rwc.topic_04_interfaces;

/*
Notice we must import this class because it is in another package
 */
import edu.njit.rwc.topic_02_classes.Dog;

public class DogPet extends Dog implements Pet {

    /**
     * We must implement this method from the interface Pet
     */
    public void pet(){
        System.out.println("Feels furry");
    }

}
