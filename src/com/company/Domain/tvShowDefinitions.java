package com.company.Domain;

public abstract class tvShowDefinitions {
    private String summary;
    private int airingDate;
    private int rating;

    public tvShowDefinitions(String summary, int airingDate, int rating) {
        this.summary = summary;
        this.airingDate = airingDate;
        this.rating = rating;
    }

    public String getSummary() {
        return summary;
    }

    public int getAiringDate() {
        return airingDate;
    }

    public int getRating() {
        return rating;
    }
}
