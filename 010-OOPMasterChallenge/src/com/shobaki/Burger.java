package com.shobaki;

public class Burger {
    private String name;
    private String meetType;
    private String breadType;
    private double price;

    private String a1Name;
    private double a1Price;

    private String a2Name;
    private double a2Price;

    private String a3Name;
    private double a3Price;

    private String a4Name;
    private double a4Price;

    public Burger(String name, String meetType, String breadType, double price) {
        this.name = name;
        this.meetType = meetType;
        this.breadType = breadType;
        this.price = price;
    }

    public void BurgerAdd1(String a, double p){
        this.a1Name = a;
        this.a1Price = p;
    }

    public void BurgerAdd2(String a, double p){
        this.a2Name = a;
        this.a2Price = p;
    }

    public void BurgerAdd3(String a, double p){
        this.a3Name = a;
        this.a3Price = p;
    }

    public void BurgerAdd4(String a, double p){
        this.a4Name = a;
        this.a4Price = p;
    }

    public double totalBurgerPrice(){
        double totalBurgerPrice = this.price;
        System.out.println(this.name + " Burger with " + this.breadType + " bread with " + this.meetType
        + " meat, Price is " +this.price);
        if(a1Name != null){
            totalBurgerPrice += a1Price;
            System.out.println("Added " + this.a1Name + " for an extra " + this.a1Price);
        }
        if(a2Name != null){
            totalBurgerPrice += a2Price;
            System.out.println("Added " + this.a2Name + " for an extra " + this.a2Price);
        }
        if(a3Name != null){
            totalBurgerPrice += a3Price;
            System.out.println("Added " + this.a3Name + " for an extra " + this.a3Price);
        }
        if(a4Name != null){
            totalBurgerPrice += a4Price;
            System.out.println("Added " + this.a4Name + " for an extra " + this.a4Price);
        }

        return totalBurgerPrice;
    }
}
