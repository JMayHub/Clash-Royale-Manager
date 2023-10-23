
package com.example.clashroyalemanager.clases;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class CurrentSeason implements Serializable
{

    @SerializedName("trophies")
    @Expose
    private Integer trophies;
    @SerializedName("bestTrophies")
    @Expose
    private Integer bestTrophies;
    private final static long serialVersionUID = -7579937325386767498L;

    public Integer getTrophies() {
        return trophies;
    }

    public void setTrophies(Integer trophies) {
        this.trophies = trophies;
    }

    public Integer getBestTrophies() {
        return bestTrophies;
    }

    public void setBestTrophies(Integer bestTrophies) {
        this.bestTrophies = bestTrophies;
    }

}
