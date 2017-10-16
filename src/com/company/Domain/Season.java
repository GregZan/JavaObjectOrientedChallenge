package com.company.Domain;

import java.util.ArrayList;

public class Season extends tvShowDefinitions{
    private ArrayList<Episode> episodeList = new ArrayList<>();

    public Season(String summary, int airingDate, int rating, ArrayList<Episode> episodeList) {
        super(summary, airingDate, rating);
        this.episodeList = episodeList;
    }

    public ArrayList<Episode> getEpisodeList() {
        return episodeList;
    }

}
