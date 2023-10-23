
package com.example.clashroyalemanager.clases;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class BestSeason implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("trophies")
    @Expose
    private Integer trophies;
    private final static long serialVersionUID = -9201963840595038009L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTrophies() {
        return trophies;
    }

    public void setTrophies(Integer trophies) {
        this.trophies = trophies;
    }

}
