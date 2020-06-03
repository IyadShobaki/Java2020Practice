package com.shobaki;

//every time we need to change a field or method name we have to change them in another classes
public class Player {
    //    public String name;
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            //Reduce number of lives remaining for the player

        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
