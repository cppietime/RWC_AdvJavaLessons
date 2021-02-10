package edu.njit.rwc.topic_02_classes;

/**
 * This is an example of a subclass. Specifying extends Dog means this is a subclass of Dog.
 * A subclass has everything its parent class has, but can add new things or override the old.
 * Note that, even when a class doesn't extend anything, it still has Object as a parent class.
 */
public class Corgi extends Dog {

    public int pounds; // Only for corgis, we want to keep track of how heavy they are.

    /**
     * This will be called whenever we create a new Corgi object.
     * @param lbs How heavy is this corgi?
     */
    public Corgi(int lbs){
        super(); // This calls the constructor of the parent class
        pounds = lbs;
    }

    /**
     * This function overrides the bark function that Dog has. When we call bark on a Corgi, this will be executed.
     */
    public void bark(){
        System.out.println("Yap! I weight " + pounds + " pounds!");
        System.out.println("I already yapped " + timesBarked + " times!");
        timesBarked ++;
    }

}
