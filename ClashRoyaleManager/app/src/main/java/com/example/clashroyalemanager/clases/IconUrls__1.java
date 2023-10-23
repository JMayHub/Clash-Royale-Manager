
package com.example.clashroyalemanager.clases;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class IconUrls__1 implements Serializable
{

    @SerializedName("medium")
    @Expose
    private String medium;
    @SerializedName("evolutionMedium")
    @Expose
    private String evolutionMedium;
    private final static long serialVersionUID = -758666439211735132L;

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getEvolutionMedium() {
        return evolutionMedium;
    }

    public void setEvolutionMedium(String evolutionMedium) {
        this.evolutionMedium = evolutionMedium;
    }

}
