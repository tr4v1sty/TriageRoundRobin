package com.TriageRoundRobin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskGiver {
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
            System.out.println();
            TaskGiver.listOfTechs.remove(tech);
            System.out.println();
            System.out.println("removed " + tech.getTechName());
            System.out.println();
        }
    }
    //start the round robin sesh?
    public static void askUserGiveTasks(){
        System.out.println("\n\nWould you like to start the task round robin? (y/n)\n");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        if (x.equals("y")){
            TaskGiver.giveTasks();
        }
        else if (x.equals("n")){
            TaskGiver.displayTechInfo();
        }
        else {
            System.out.println("\nPlease type 'y' or 'n' then press enter\n");
            askUserGiveTasks();
        }
    }
    //loop through the list of techs, giving each tech a task
    public static void giveTasks() {
        for (HelpdeskTech tech : listOfTechs) {
            System.out.println("\n\n**********STARTING ROUND ROBIN*******\n" +
                    "\nIncrementing counter for " + tech.getTechName());
            tech.increaseTasksGiven();
            System.out.println("\n.... Assign " + tech.getTechName() + " a task....\n"
            +"\nYou have given " + tech.getTechName() + " " + tech.getTasksGiven() + " tasks so far "
            +"\n\nPress enter to give another task or Control+C to abort\n");
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nWould you like to go for another round of round robin?\n");
        askAnotherRound();
    }
    //Ask to go for another round
    public static void askAnotherRound(){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        if (x.equals("y")){
            giveTasks();
        }
        else if (x.equals("n")){
            TaskGiver.displayTechInfo();
        }
        else {
            System.out.println("\nPlease type 'y' or 'n' then press enter\n");
            askAnotherRound();
        }
    }
    //display the tech's info in string form
    public static void displayTechInfo(){
        for (HelpdeskTech tech : listOfTechs){
            System.out.println(tech.hdTechToString());
        }
    }

    //I forget why I wrote this
//    public static void setListOfTechs(ArrayList<HelpdeskTech> listOfTechs) {
//        TaskGiver.listOfTechs = listOfTechs;
//    }
}