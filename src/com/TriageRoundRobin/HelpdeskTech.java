package com.TriageRoundRobin;

public class HelpdeskTech {

    private String techName;
    private int tasksGiven;

    HelpdeskTech(String techName){
        this.techName = techName;
    }

    public String hdTechToString(){
        return (techName + " has been given " + tasksGiven + " by this tool for this session.");
    }
    public void increaseTasksGiven(){
        tasksGiven ++;
    }
    public String getTechName() {
        return techName;
    }

    public int getTasksGiven() {
        return tasksGiven;
    }
}

