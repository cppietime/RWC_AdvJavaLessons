package edu.njit.rwc.topic_02_classes;

/**
 * A class represents a type of object, which can have values and functions within it.
 */
public class Dog {

    /**
     * Static functions can be called without an instance of a class
     * @return The String of what a Dog is
     */
    public static String whatAmI(){
        return "Man's best friend";
    }

    /*
    This is a variable held by every dog that counts the number of times it barked.
     */
    public int timesBarked;

    /**
     * This kind of looks like a function, and in a sense, it is. It is called a constructor. Whenever we create a new
     * dog, this gets called.
     */
    public Dog(){
        timesBarked = 0; // When a new Dog is created, timesBarked will start at 0.
    }

    /**
     * This method is not static, so we need an instance of Dog on which to invoke it.
     */
    public void bark(){
        System.out.println("Bark number " + timesBarked + "!");
        timesBarked ++; // ++ increments the value, meaning it increases it by 1.
    }

}
