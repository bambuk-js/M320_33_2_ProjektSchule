package ch.bbw.pr.schule;

import java.util.ArrayList;

import ch.bbw.pr.schule.personen.*;

/**
 * Schule Application
 * @author Laura Luethi
 * @modifiedby P. Rutschmann
 */
public class Application {
    public static void main(String[] args) {
        ArrayList<Person> personen = new ArrayList<Person>();
        personen.add(new Lernender("Bea", "Mayer"));
        personen.add(new Lernender("Hans", "Mueller"));
        personen.add(new Lernender("Paul", "Muster"));
        personen.add(new Rektor("Morrol", "Muster"));
        personen.add(new Lehrperson("Frederic", "Meier"));
        personen.add(new Schulabwart("Tom", "Escher"));

        System.out.println("Liste einiger Personen an der Schule und deren Aufgaben...\n");
        for (Person person : personen) {
            System.out.println(person.toString() + person.print());
            System.out.println(" und " + person.doWork());
            System.out.println();
        }
    }
}
