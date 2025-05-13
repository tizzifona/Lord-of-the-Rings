package org.femcoders.models;

public class Wizard extends Character implements Fighter {
    private String magic;

    public Wizard(String name, int age, String race, String magic) {
        super(name, age, "Wizard");
        this.magic = magic;
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: A wizard is never late...");
    }

    public void attack() {
        System.out.println(getName() + " casts a " + magic + " spell.");
    }
}
