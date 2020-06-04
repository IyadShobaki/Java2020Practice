package com.shobaki;

public class DBurger extends Burger{
    public DBurger() {
        super("Deluxe", "Sausage & Bacon", "White",14.54);
        super.BurgerAdd1("Chips", 2.75);
        super.BurgerAdd2("Drink", 1.81);
    }

    @Override
    public void BurgerAdd1(String a, double p) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void BurgerAdd2(String a, double p) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void BurgerAdd3(String a, double p) {
        System.out.println("Can not add additional items to a deluxe burger");
    }

    @Override
    public void BurgerAdd4(String a, double p) {
        System.out.println("Can not add additional items to a deluxe burger");
    }
}
