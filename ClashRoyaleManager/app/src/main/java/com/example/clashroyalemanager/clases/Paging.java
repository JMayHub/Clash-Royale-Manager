
package com.example.clashroyalemanager.clases;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Paging implements Serializable
{

    @SerializedName("cursors")
    @Expose
    private Cursors cursors;
    private final static long serialVersionUID = 2154169626477361658L;

    public Cursors getCursors() {
        return cursors;
    }

    public void setCursors(Cursors cursors) {
        this.cursors = cursors;
    }

    public Paging withCursors(Cursors cursors) {
        this.cursors = cursors;
        return this;
    }

}
