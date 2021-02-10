package edu.njit.rwc.topic_02_classes;

/**
 * Juice extends the abstract class Beverage, so it must override its abstract methods
 */
public class Juice extends Beverage {

    public Juice(int oz){
        super(oz);
    }

    /**
     * Juice is not bitter
     * @return So we return false
     */
    public boolean isBitter(){
        return false;
    }

}
