package com.company.Domain;

public class Episode extends tvShowDefinitions{
    private String name;
    private int seasonNumber;
    private int number;

    public Episode(String summary, int airingDate, int rating, String name, int seasonNumber, int number) {
        super(summary, airingDate, rating);
        this.name = name;
        this.seasonNumber = seasonNumber;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public int getNumber() {
        return number;
    }
}
