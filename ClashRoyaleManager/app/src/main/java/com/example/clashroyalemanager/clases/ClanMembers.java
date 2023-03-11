
package com.example.clashroyalemanager.clases;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class ClanMembers implements Serializable
{

    @SerializedName("items")
    @Expose
    private List<Item> items;
    @SerializedName("paging")
    @Expose
    private Paging paging;
    private final static long serialVersionUID = -5558568878008339230L;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public ClanMembers withItems(List<Item> items) {
        this.items = items;
        return this;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public ClanMembers withPaging(Paging paging) {
        this.paging = paging;
        return this;
    }

}
