package com.shobaki;

public class Vehicle {
    private String typeOfVehicle; //airship, airplane, helicopter, car, bicycle, motorcycle, van,ship,
                        //submarine, tractor, train, tram, boats
    private int engine;
    private String color;
    private int length;
    private int width;

    private int currentVelocity = 0;
    private int currentDirection= 0;

    public Vehicle(String typeOfVehicle, int engine,  String color, int length, int width) {
        this.typeOfVehicle = typeOfVehicle;
        this.engine = engine;
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public void steer(int direction){
        this.currentDirection = direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }
    public void move(int velocity, int direction){
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }
    public void stop(){
        this.currentVelocity = 0;
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

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
