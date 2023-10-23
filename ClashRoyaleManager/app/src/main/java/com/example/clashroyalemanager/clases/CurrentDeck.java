
package com.example.clashroyalemanager.clases;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class CurrentDeck implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("starLevel")
    @Expose
    private Integer starLevel;
    @SerializedName("evolutionLevel")
    @Expose
    private Integer evolutionLevel;
    @SerializedName("maxLevel")
    @Expose
    private Integer maxLevel;
    @SerializedName("maxEvolutionLevel")
    @Expose
    private Integer maxEvolutionLevel;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("iconUrls")
    @Expose
    private IconUrls__2 iconUrls;
    private final static long serialVersionUID = -1145366712390327776L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(Integer starLevel) {
        this.starLevel = starLevel;
    }

    public Integer getEvolutionLevel() {
        return evolutionLevel;
    }

    public void setEvolutionLevel(Integer evolutionLevel) {
        this.evolutionLevel = evolutionLevel;
    }

    public Integer getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    public Integer getMaxEvolutionLevel() {
        return maxEvolutionLevel;
    }

    public void setMaxEvolutionLevel(Integer maxEvolutionLevel) {
        this.maxEvolutionLevel = maxEvolutionLevel;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public IconUrls__2 getIconUrls() {
        return iconUrls;
    }

    public void setIconUrls(IconUrls__2 iconUrls) {
        this.iconUrls = iconUrls;
    }

}
