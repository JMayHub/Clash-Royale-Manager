
package com.example.clashroyalemanager.clases;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class BestPathOfLegendSeasonResult implements Serializable
{

    @SerializedName("leagueNumber")
    @Expose
    private Integer leagueNumber;
    @SerializedName("trophies")
    @Expose
    private Integer trophies;
    @SerializedName("rank")
    @Expose
    private Object rank;
    private final static long serialVersionUID = -8654393519677222119L;

    public Integer getLeagueNumber() {
        return leagueNumber;
    }

    public void setLeagueNumber(Integer leagueNumber) {
        this.leagueNumber = leagueNumber;
    }

    public Integer getTrophies() {
        return trophies;
    }

    public void setTrophies(Integer trophies) {
        this.trophies = trophies;
    }

    public Object getRank() {
        return rank;
    }

    public void setRank(Object rank) {
        this.rank = rank;
    }

}
