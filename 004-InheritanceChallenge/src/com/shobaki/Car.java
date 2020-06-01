package com.shobaki;

public class Car extends Vehicle {
    private String typeOfCar; //micro, hatchback, sedan, SUV, MPV, convertible, wagon, luxury, antique
                                //sports car, coupe, supercar, muscle car, limousine, hybird car, electric, diesel

    private String make;
    private String model;
    private int steering;
    private int numberOfWheels;
    private String typeOfPropulsion;
    private int currentGear;
    public Car( String color, int length, int width, String typeOfCar,
                String make, String model, int steering,
                int numberOfWheels, String typeOfPropulsion) {
        super("Car", 1, color, length, width);
        this.typeOfCar = typeOfCar;
        this.make = make;
        this.model = model;
        this.steering = steering;
        this.numberOfWheels = numberOfWheels;
        this.typeOfPropulsion = typeOfPropulsion;
    }
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to "+ this.currentGear + " gear.");
    }
    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }
    public  String getTypeOfCar() {
        return typeOfCar;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getSteering() {
        return steering;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getTypeOfPropulsion() {
        return typeOfPropulsion;
    }
}
