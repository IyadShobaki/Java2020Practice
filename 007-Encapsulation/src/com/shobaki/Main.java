package com.shobaki;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Iyad";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        //after creating a class using encapsulation

        EnhancedPlayer player = new EnhancedPlayer("Iyad", 200, "Sword");
        System.out.println("Initial health is "+ player.getHealth());
    }
}
