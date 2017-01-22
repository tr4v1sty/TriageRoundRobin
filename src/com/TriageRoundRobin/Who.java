package com.TriageRoundRobin;

import java.util.ArrayList;
import java.util.Scanner;

public class Who {


    public static void wouldYouLikeRemove(){
        System.out.println();
        System.out.println("Remove anyone from the list? (y/n)");
        System.out.println();
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
            System.out.println();
            System.out.println("Please type 'y' or 'n' then press enter");
            System.out.println();
            wouldYouLikeRemove();
        }
    }

    //    Who would you like to remove
    public static void whoToRemove(){
        ArrayList<HelpdeskTech> peopleToRemove = new ArrayList<HelpdeskTech>();

        System.out.println();
        System.out.println("Who would you like to remove?  (Type a name and press Enter)");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        for (HelpdeskTech hdt : TaskGiver.listOfTechs){
            if (hdt.getTechName().equals(x)){
                peopleToRemove.add(hdt);
                break;
            }
        }


        for (HelpdeskTech tech : peopleToRemove){
            System.out.println();
            TaskGiver.listOfTechs.remove(tech);
            System.out.println();
            System.out.println("removed " + tech.getTechName());
            System.out.println();
        }
    }

    public static void wouldYouLikeAdd(){
        System.out.println();
        System.out.println("ADD anyone to the list? (y/n)");
        System.out.println();
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
            System.out.println();
            System.out.println("Please type 'y' or 'n' then press enter");
            System.out.println();
            wouldYouLikeAdd();
        }
    }

    public static void whoToAdd(){
        System.out.println();
        System.out.println("Who would you like to ADD to the list?  (Type a name and press Enter)");
        System.out.println();

        ArrayList<HelpdeskTech> peopleToAdd = new ArrayList<HelpdeskTech>();
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();


        for (HelpdeskTech hdt : TaskGiver.listOfTechs){
            if (hdt.getTechName().equals(x)){
                System.out.println();
                System.out.println("The list already contains " + hdt.getTechName());
                System.out.println();
                wouldYouLikeAdd();
            }
            else{
                continue;
            }
        }

        peopleToAdd.add(new HelpdeskTech(x));

        for (HelpdeskTech tech : peopleToAdd){
            TaskGiver.listOfTechs.add(new HelpdeskTech(tech.getTechName()));
            System.out.println();
            System.out.println("added " + tech.getTechName());
            System.out.println();
        }


    }


}
