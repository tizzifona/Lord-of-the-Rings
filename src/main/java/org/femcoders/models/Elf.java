package org.femcoders.models;

public class Elf extends Character implements Fighter {
    private String bow;

    public Elf(String name, int age, String race, String bow) {
        super(name, age, race);
        this.bow = bow;
    }

    @Override
    public void speak() {
        System.out.println(getName()+ " says: Mae govannen!");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with a " + bow);
    }
}
