
package com.example.clashroyalemanager.clases;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class IconUrls implements Serializable
{

    @SerializedName("large")
    @Expose
    private String large;
    private final static long serialVersionUID = -1008805390041444723L;

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

}
