package org.femcoders.models;


public class Elf extends Character implements Fighter {
    private final String bow;

    public Elf(String name, int age, String bow) {
        super(name, age, "Elf");
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
