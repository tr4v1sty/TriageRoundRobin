package com.TriageRoundRobin;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        //add the array of strings(people's names) to the listOfTechs
        TaskGiver.addNamesToTechList();
        System.out.println();
        System.out.println();

        Who.wouldYouLikeRemove();

        TaskGiver.askUserGiveTasks();

    }

}

