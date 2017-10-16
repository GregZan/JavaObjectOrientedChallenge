package com.company.Domain;

import java.util.ArrayList;

public class Series extends tvShowDefinitions{
    private String name;
    private ArrayList<Episode> seasonList = new ArrayList<>();

    public Series(String summary, int airingDate, int rating, String name, ArrayList<Episode> seasonList) {
        super(summary, airingDate, rating);
        this.name = name;
        this.seasonList = seasonList;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Episode> getSeasonList() {
        return seasonList;
    }
}
