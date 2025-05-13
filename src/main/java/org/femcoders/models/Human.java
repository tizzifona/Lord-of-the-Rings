package org.femcoders.models;

public class Human extends Character implements Fighter {
    public Human(String name, int age) {
        super(name, age, "Human");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: For Gondor!");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " swings a sword fiercely.");
    }
}
