package edu.njit.rwc.topic_02_classes;

/**
 * An abstract class is special in that you cannot create it directly.
 */
public abstract class Beverage {

    public int ounces;

    public Beverage(int oz){
        ounces = oz;
    }

    public void drink(int oz){
        if(ounces >= oz) {
            ounces -= oz;
            System.out.println("Sip sip");
            if(isBitter())
                System.out.println("Eugh!");
        }
        else{
            ounces = 0;
            System.out.println("Not enough left...");
        }
    }

    /**
     * An abstract function in an abstract class does not have a body. It needs to be overridden by a non-abstract
     * subclass.
     * @return Whether this drink is bitter
     */
    public abstract boolean isBitter();

}
