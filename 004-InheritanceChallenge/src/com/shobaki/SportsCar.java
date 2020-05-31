package com.shobaki;

public class SportsCar extends Car{
    private int roofTop;
    private int turbo;

    public SportsCar(String color, int length, int width,
                     String make, String model, int steering, int numberOfWheels,
                     String typeOfPropulsion, int roofTop, int turbo) {
        super(color, length, width, "Sport car", make, model, steering, numberOfWheels, typeOfPropulsion);
        this.roofTop = roofTop;
        this.turbo = turbo;
    }

    public int getRoofTop() {
        return roofTop;
    }

    public int getTurbo() {
        return turbo;
    }
}
