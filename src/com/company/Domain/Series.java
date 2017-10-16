package com.company.Domain;

import java.util.ArrayList;

public class Series extends tvShowDefinitions{
    private String name;
    private ArrayList<Season> seasonList = new ArrayList<>();
    private String genre;

    public Series(String summary, int airingDate, int rating, String name, ArrayList<Season> seasonList, String genre) {
        super(summary, airingDate, rating);
        this.name = name;
        this.seasonList = seasonList;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Season> getSeasonList() {
        return seasonList;
    }

    public String getGenre() {
        return genre;
    }
}
