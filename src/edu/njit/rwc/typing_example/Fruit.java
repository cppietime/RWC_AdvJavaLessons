package edu.njit.rwc.typing_example;

public class Fruit {

    public int oz;
    public String color;

    public Fruit(int oz, String color) {
        this.oz = oz;
        this.color = color;
    }

    public Fruit halfMyWeight() {
        return new Fruit(oz / 2, color);
    }

    public double pounds() {
        return oz / 16.0;
    }

}
