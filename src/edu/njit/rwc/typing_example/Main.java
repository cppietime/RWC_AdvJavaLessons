package edu.njit.rwc.typing_example;

public class Main {

    public static void main(String[] args) {
        Fruit mysteryFruit = new Fruit(40, "green");
        System.out.println("mysteryFruit is of type " + mysteryFruit.getClass().getSimpleName());
        Fruit mysteryHalfFruit = mysteryFruit.halfMyWeight();
        System.out.println("Original mysteryFruit is " + mysteryFruit.pounds() + " lbs, but half of that is " + mysteryHalfFruit.pounds());

        System.out.println("\n==============\n");

        Apple apple = new Apple(20);
        System.out.println("The apple is " + apple.color);
        System.out.println("Apple is of type " + apple.getClass().getSimpleName());
        Fruit halfApple = apple.halfMyWeight();
        System.out.println("Half of that still has the color " + halfApple.color);
        System.out.println("HalfApple is of type " + halfApple.getClass().getSimpleName());

        System.out.println("\n==============\n");

        Banana banana = new Banana(30);
        Fruit peeled = banana.peel();
        System.out.println("My banana was " + banana.oz + " oz, then I peeled it and now it's " + peeled.oz);
        System.out.println("Banana is of type " + banana.getClass().getSimpleName());
        System.out.println("Peeled is of type " + peeled.getClass().getSimpleName());
    }

}
