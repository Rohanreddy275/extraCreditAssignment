
package com.mycompany.extracreditsassignment;

/**
 *
 * @author srohan
 */
public class Batsman {
    //variable to store name of batsman
    private String name;
    //variable to store age of batsman
    private int age;
    //variable to store total runs scored by batsman
    private int runsScored;
    //variable to store total matches played by batsman
    private int matchesPlayed;

    //getter setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }
  
    /**
     * non getter setter method, it calculates the average of batsman, by dividing the total runs
     * scored by batsman by the total number of matches played by batsman
     * @return
     */
    public int getAverage() {

        //if mattches played =0, then average will be 0
        if (matchesPlayed == 0) {
            return 0;
        }
        //else calculate the averrage by dividing the total runs scored by batsman by the total number of matches played by batsman
        else {
            return runsScored / matchesPlayed;
        }
    }

    //no-arg/empty constructor
    public Batsman() {
    }

    //constructor that sets all the attributes of the class
    public Batsman(String name, int age, int runsScored, int matchesPlayed) {
        this.name = name;
        this.age = age;
        this.runsScored = runsScored;
        this.matchesPlayed = matchesPlayed;
    }
}
