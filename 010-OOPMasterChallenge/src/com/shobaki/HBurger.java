package com.shobaki;

public class HBurger extends Burger{

    private String a1Name;
    private double a1Price;

    private String a2Name;
    private double a2Price;

    public HBurger(String meetType, double price) {
        super("Healthy Burger", meetType, "Brown Rye", price);
    }

    public void HealthyAdd1(String a, double p){
        this.a1Name = a;
        this.a1Price = p;
    }
    public void HealthyAdd2(String a, double p){
        this.a2Name = a;
        this.a2Price = p;
    }

    @Override
    public double totalBurgerPrice() {
        double totalHealthyPrice = super.totalBurgerPrice();
        if(a1Name != null){
            totalHealthyPrice += a1Price;
            System.out.println("Added " + this.a1Name + " for an extra " + this.a1Price);
        }
        if(a2Name != null){
            totalHealthyPrice += a2Price;
            System.out.println("Added " + this.a2Name + " for an extra " + this.a2Price);
        }
        return totalHealthyPrice;
    }
}
