package com.company.Domain;

import java.util.ArrayList;

public class Season extends tvShowDefinitions{
    private ArrayList<Episode> episodeList = new ArrayList<>();
    private String name;

    public Season(String summary, int airingDate, int rating, ArrayList<Episode> episodeList, String name) {
        super(summary, airingDate, rating);
        this.episodeList = episodeList;
        this.name = name;
    }

    public ArrayList<Episode> getEpisodeList() {
        return episodeList;
    }

    public String getName() {
        return name;
    }
}
