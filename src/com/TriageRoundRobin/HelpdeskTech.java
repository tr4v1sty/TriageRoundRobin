package com.TriageRoundRobin;

public class HelpdeskTech {

    //instance variables
    private String techName;
    private int[] startEndTimes = new int[2];
    private String nickName;
    private int tasksGiven;

    //instance methods
    public String hdTechToString(){
        return (techName + " has been given " + tasksGiven + " by this tool for this session.");
    }
    public void increaseTasksGiven(){
        tasksGiven ++;
    }




    //constructors
    HelpdeskTech(String techName){
        this.techName = techName;
    }

    HelpdeskTech(String techName, int[] startEndTimes){
        this.techName = techName;
        this.startEndTimes = startEndTimes;
    }

    //getters and setters
    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public int[] getStartEndTimes() {
        return startEndTimes;
    }

    public void setStartEndTimes(int[] startEndTimes) {
        this.startEndTimes = startEndTimes;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public int getTasksGiven() {
        return tasksGiven;
    }

    public void setTasksGiven(int tasksGiven) {
        this.tasksGiven = tasksGiven;
    }





}

