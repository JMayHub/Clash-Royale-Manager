
package com.example.clashroyalemanager.clases;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class CurrentFavouriteCard implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("maxLevel")
    @Expose
    private Integer maxLevel;
    @SerializedName("iconUrls")
    @Expose
    private IconUrls__3 iconUrls;
    private final static long serialVersionUID = -8247136794036191649L;

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

    public Integer getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    public IconUrls__3 getIconUrls() {
        return iconUrls;
    }

    public void setIconUrls(IconUrls__3 iconUrls) {
        this.iconUrls = iconUrls;
    }

}
