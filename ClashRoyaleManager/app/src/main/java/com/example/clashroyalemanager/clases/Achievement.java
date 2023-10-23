
package com.example.clashroyalemanager.clases;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Achievement implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("stars")
    @Expose
    private Integer stars;
    @SerializedName("value")
    @Expose
    private Integer value;
    @SerializedName("target")
    @Expose
    private Integer target;
    @SerializedName("info")
    @Expose
    private String info;
    @SerializedName("completionInfo")
    @Expose
    private Object completionInfo;
    private final static long serialVersionUID = 7399151888997444392L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getTarget() {
        return target;
    }

    public void setTarget(Integer target) {
        this.target = target;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Object getCompletionInfo() {
        return completionInfo;
    }

    public void setCompletionInfo(Object completionInfo) {
        this.completionInfo = completionInfo;
    }

}
