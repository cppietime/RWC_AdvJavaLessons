package edu.njit.rwc.topic_02_classes;

/**
 * Coffee extends the abstract class Beverage, so it must override its abstract methods
 */
public class Coffee extends Beverage {

    public Coffee(int oz){
        super(oz);
    }

    /**
     * Coffee is bitter
     * @return So we return true
     */
    public boolean isBitter(){
        return true;
    }

}
