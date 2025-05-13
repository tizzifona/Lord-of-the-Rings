package org.femcoders;
import org.femcoders.models.*;
import org.femcoders.models.Character;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Character> fellowship = new ArrayList<>();

        Character legolas = new Elf("Legolas", 2931, "Elven Longbow");
        Character gimli = new Dwarf("Gimli", 140);
        Character gandalf = new Wizard("Gandalf", 2019, "Frost");
        Character aragorn = new Human("Aragorn", 87);

        fellowship.add(legolas);
        fellowship.add(gimli);
        fellowship.add(gandalf);
        fellowship.add(aragorn);

        for (Character member : fellowship) {
            member.speak();
            if (member instanceof Fighter) {
                ((Fighter) member).attack();
            }
            System.out.println();
        }
    }
}
