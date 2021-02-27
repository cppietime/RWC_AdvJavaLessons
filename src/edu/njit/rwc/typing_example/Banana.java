package edu.njit.rwc.typing_example;

public class Banana extends Fruit {

    public Banana(int oz) {
        super(oz, "yellow");
    }

    public Banana peel() {
        return new Banana(oz - 1);
    }

}
