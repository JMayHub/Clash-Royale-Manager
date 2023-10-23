
package com.example.clashroyalemanager.clases;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class LeagueStatistics implements Serializable
{

    @SerializedName("currentSeason")
    @Expose
    private CurrentSeason currentSeason;
    @SerializedName("previousSeason")
    @Expose
    private PreviousSeason previousSeason;
    @SerializedName("bestSeason")
    @Expose
    private BestSeason bestSeason;
    private final static long serialVersionUID = 6839827164482699355L;

    public CurrentSeason getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(CurrentSeason currentSeason) {
        this.currentSeason = currentSeason;
    }

    public PreviousSeason getPreviousSeason() {
        return previousSeason;
    }

    public void setPreviousSeason(PreviousSeason previousSeason) {
        this.previousSeason = previousSeason;
    }

    public BestSeason getBestSeason() {
        return bestSeason;
    }

    public void setBestSeason(BestSeason bestSeason) {
        this.bestSeason = bestSeason;
    }

}
