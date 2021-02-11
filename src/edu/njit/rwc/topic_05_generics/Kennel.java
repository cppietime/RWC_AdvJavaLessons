package edu.njit.rwc.topic_05_generics;

import edu.njit.rwc.topic_04_interfaces.Pet;

/**
 * Kennel is an example of a generic type. When Kennel is created, a type T is provided that implements the Pet
 * interface. Even though Pet is an interface, and is implemented instead of extended, for generic types,
 * we still use the keyword extends.
 */
public class Kennel<T extends Pet> {

    /*
    Arrays of generic types are possible, but can be tricky. Instead, we can use an Object array and cast elements
    individually as needed
     */
    private final Object[] spaces;

    /*
     * We can use T as a type in a variable, like so
     */
    private T lastPet = null;

    public Kennel(int capacity){
        spaces = new Object[capacity];
    }

    /**
     * Leaves a pet at the kennel if there is space
     * @return True if the pet was accepted
     */
    public boolean deposit(T pet){
        for(int i = 0; i < spaces.length; i++){
            if(spaces[i] == null){
                lastPet = pet;
                spaces[i] = pet;
                return true;
            }
        }
        return false;
    }

    /**
     * Take out a pet from the kennel, if it's in there
     * @return The indexed pet, or null
     */
    public T withdraw(int index){
        if(index < 0 || index >= spaces.length)
            return null;
        Object o = spaces[index];
        if(o == lastPet)
            lastPet = null;
        spaces[index] = null;
        return (T)o;
    }

    /**
     * Call pet on the last pet left here
     */
    public void petLast(){
        if(lastPet != null)
            lastPet.pet();
    }

    /**
     * Pet all the pets
     */
    public void petAll(){
        for(Object o : spaces){
            if(o != null)
                ((Pet)o).pet(); // Because spaces is an Object array, we cast the elements as needed
        }
    }

    /**
     * This is an example of how a function can take a generic type that's not part of a class definition.
     * This function takes a single pet and returns a kennel of capacity 1 that holds only that pet.
     */
    public static <T extends Pet> Kennel<T> singleKennel(T pet){
        Kennel<T> kennel = new Kennel<>(1);
        kennel.deposit(pet);
        return kennel;
    }

}
