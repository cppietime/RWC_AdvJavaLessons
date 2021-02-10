package edu.njit.rwc.topic_02_classes;

public class Main {

    public static void main(String[] args){

        System.out.println(Dog.whatAmI()); // This static method can be called from the class itself

        Dog dog = new Dog(); // This is how we create a new instance of a class.
        System.out.println(dog.timesBarked);
        dog.bark();
        System.out.println(dog.timesBarked);

        Corgi corgi = new Corgi(7); // This creates a new Corgi that weighs 7 lbs
        corgi.bark();

        Dog dog2 = new Corgi(5); // Because Corgi is a subclass of Dog, we can assign a Corgi to a Dog variable
        dog2.bark();

        /*
         * This is an example of a cast. It takes the value of dog2 and treats it as type Corgi, then assigns it to
         * corgi2. This can be done because the value of dog2 is actually a Corgi. If we tried to cast dog to Corgi,
         * it would fail.
         */
        Corgi corgi2 = (Corgi) dog2;
        corgi2.bark();

        /*
         * instanceof returns true when the lefthand operand is of type of righthand operand.
         * See what each of these prints.
         */
        System.out.println(dog instanceof Dog);
        System.out.println(dog instanceof Corgi);
        System.out.println(corgi instanceof Dog);
        System.out.println(corgi instanceof Corgi);

        /*
        Now let's look at abstract classes
         */
        Beverage juice = new Juice(16); // Similarly, we can assign Juice to its parent class Beverage
        juice.drink(5);

        Beverage coffee = new Coffee(20);
        coffee.drink(8);

        /*
        This is a loop. A while loop. It will keep executing as long as the condition in its parentheses is true.
        How many times will this run?
         */
        while(coffee.ounces > 0){
            coffee.drink(2);
        }

        /*
        A for loop is another kind of loop. It has 3 statements in its parentheses.
        The first runs when the loop starts. The second is a condition that must be true for the loop to continue.
        The third is a statement that runs after each iteration of the loop. What will this one do?
         */
        for(int i = 0; i < 4; i++){
            juice.drink(1);
        }

        for(int i = 1; i < 11; i++){
            if(i % 3 == 0)
                continue; // continue skips the rest of this iteration of the loop.
            else if(i % 8 == 0)
                break; // break breaks out of the loop entirely.
            System.out.println(i);
        }
    }

}
