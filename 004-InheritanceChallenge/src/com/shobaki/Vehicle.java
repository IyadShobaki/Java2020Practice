package com.shobaki;

public class Vehicle {
    private String typeOfVehicle; //airship, airplane, helicopter, car, bicycle, motorcycle, van,ship,
                        //submarine, tractor, train, tram, boats
    private int engine;
    private String color;
    private int length;
    private int width;

    public Vehicle(String typeOfVehicle, int engine,  String color, int length, int width) {
        this.typeOfVehicle = typeOfVehicle;
        this.engine = engine;
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public void move(int speed){
        System.out.println("Vehicle.move() called. On speed " + speed );
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public int getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
