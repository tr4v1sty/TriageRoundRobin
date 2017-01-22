package com.TriageRoundRobin;

import java.util.ArrayList;

/**
 * Created by travist on 1/21/17.
 */
public class ListOfTechs {
    public static ArrayList<HelpdeskTech> listOfTechs = new ArrayList<HelpdeskTech>();
    public static String [] listOfPeeps = {"Travis","Spencer","Blue","Ron","Chris","George",
            "Joey","Walters","Chace","Aryn","Thomas","Matt","Robert","Rick","Hughes","Brandon"};

    //Add names to the list of techs
    public static void addNamesToTechList(){
        for(String i : listOfPeeps){
            listOfTechs.add(new HelpdeskTech(i));
            System.out.println("added " + i + " to the listOfTechs");
        }
    }
    public static void removeNamesfromTechList(){
        for (HelpdeskTech tech : Who.peopleToRemove){
            ListOfTechs.listOfTechs.remove(tech);
            System.out.println("\n\nremoved " + tech.getTechName() + "\n");
        }
    }
    //display the tech's info in string form
    public static void displayListOfTechs(){
        for (HelpdeskTech tech : listOfTechs){
            System.out.println(tech.hdTechToString());
        }
    }
}
