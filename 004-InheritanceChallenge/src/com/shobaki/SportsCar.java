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
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        }else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if(newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        }else if(newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }else{
            changeGear(4);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
    public int getRoofTop() {
        return roofTop;
    }

    public int getTurbo() {
        return turbo;
    }
}
