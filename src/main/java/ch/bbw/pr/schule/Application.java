package ch.bbw.pr.schule;

import java.util.ArrayList;

import ch.bbw.pr.schule.personen.*;

/**
 * Schule Application
 * @author Laura Luethi
 * @modifiedby P. Rutschmann
 */
public class Application {
	//Nicht veraendern
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
            System.out.println(" und " + getAufgaben(person));
            System.out.println();
        }
    }
    
    private static String getAufgaben(Person person) {
    	String text=null;

        if(person instanceof Lehrperson lehrperson){
            text = lehrperson.korrigiertPruefungen();
        }

        if(person instanceof Lernender lernender){
            text = lernender.machtHausaufgaben();
        }

        if(person instanceof Schulabwart schulabwart){
            text = schulabwart.repariertBeleuchtung();
        }

        if(person instanceof Rektor rektor){
            text = rektor.signiertZeugnisse();
        }
        
    	return text;
    }
}
