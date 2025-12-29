package com.ipl;

public class Team {
    private String name;
    private int matches;
    private int wins;
    private int losses;
    private int points;
    private double nrr;

    public Team(String name, int matches, int wins, int losses, int points, double nrr) {
        this.name = name;
        this.matches = matches;
        this.wins = wins;
        this.losses = losses;
        this.points = points;
        this.nrr = nrr;
    }

    public String getName() { return name; }
    public int getMatches() { return matches; }
    public int getWins() { return wins; }
    public int getLosses() { return losses; }
    public int getPoints() { return points; }
    public double getNrr() { return nrr; }
}
