package edu.njit.rwc.topic_04_interfaces;

/**
 * Interfaces are like abstract classes in that they can have functions without bodies that must be implemented by
 * a class. They differ from abstract classes in that, instead of being extended by a class, they are implemented.
 * While a class may only extend one other class, it can implement any number of interfaces.
 * Also, interfaces do not have any member variables, only methods. All of an interface's methods are public.
 */
public interface Pet {

    void pet(); // This function must be implemented by an implementing class

    /*
    But an interface method can be declared default to have a default implementation
    that does not need to be implemented in a class.
     */
    default boolean goodBoy(){
        return true;
    }

}
