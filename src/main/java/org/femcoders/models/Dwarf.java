package org.femcoders.models;

public class Dwarf extends  Character implements Fighter{

    public Dwarf(String name, int age) {
        super(name, age, "Dwarf");
    }

    @Override
    public void speak(){
        System.out.println(getName() + " says: Nobody tosses a dwarf!");
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with his axe.");
    }
}
