package org.example;

public class Player {
    private final String name;
    private int healthPercentage;
    private final Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = clampHealth(healthPercentage);
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        if (damage < 0) damage = 0;
        healthPercentage -= damage;

        if (healthPercentage <= 0) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion) {
        if (healthPotion < 0) healthPotion = 0;
        healthPercentage += healthPotion;

        if (healthPercentage > 100) {
            healthPercentage = 100;
        }
    }

    private int clampHealth(int value) {
        if (value > 100) return 100;
        if (value < 0) return 0;
        return value;
    }
}