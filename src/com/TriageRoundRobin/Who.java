package com.TriageRoundRobin;

import java.util.ArrayList;
import java.util.Scanner;

public class Who {
    public static ArrayList<HelpdeskTech> peopleToRemove = new ArrayList<HelpdeskTech>();

    public static void wouldYouLikeRemove(){
        System.out.println("\n\n\nRemove anyone from the list? (y/n)\n");

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        if (x.equals("y")){
            whoToRemove();
            wouldYouLikeRemove();
        }
        else if (x.equals("n")){
            wouldYouLikeAdd();
        }
        else {
            System.out.println("\nPlease type 'y' or 'n' then press enter\n");
            wouldYouLikeRemove();
        }
    }
    //    Who would you like to remove
    public static void whoToRemove(){
        System.out.println("\nWho would you like to remove?  (Type a name and press Enter)\n");

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        for (HelpdeskTech hdt : ListOfTechs.listOfTechs){
            if (hdt.getTechName().equals(x)){
                peopleToRemove.add(hdt);
                break;
            }
        }
        ListOfTechs.removeNamesfromTechList();
    }

    public static void wouldYouLikeAdd(){
        System.out.println("\nADD anyone to the list? (y/n)\n");

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        if (x.equals("y")){
            whoToAdd();
            wouldYouLikeRemove();
        }
        else if (x.equals("n")){
            TaskGiver.askUserGiveTasks();
        }
        else {
            System.out.println("\nPlease type 'y' or 'n' then press enter\n");
            wouldYouLikeAdd();
        }
    }

    public static void whoToAdd(){
        ArrayList<HelpdeskTech> peopleToAdd = new ArrayList<HelpdeskTech>();

        System.out.println("\nWho would you like to ADD to the list?  (Type a name and press Enter)\n");

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        for (HelpdeskTech hdt : ListOfTechs.listOfTechs){
            if (hdt.getTechName().equals(x)){
                System.out.println("\nThe list already contains " + hdt.getTechName() + "\n");
                wouldYouLikeAdd();
            }
            else{
                continue;
            }
        }
        peopleToAdd.add(new HelpdeskTech(x));

        for (HelpdeskTech tech : peopleToAdd){
            ListOfTechs.listOfTechs.add(new HelpdeskTech(tech.getTechName()));
            System.out.println("\nadded " + tech.getTechName() + "\n");
        }
    }
}
