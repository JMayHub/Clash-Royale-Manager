
package com.example.clashroyalemanager.clases;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Item implements Serializable
{

    @SerializedName("tag")
    @Expose
    private String tag;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("lastSeen")
    @Expose
    private String lastSeen;
    @SerializedName("expLevel")
    @Expose
    private Integer expLevel;
    @SerializedName("trophies")
    @Expose
    private Integer trophies;
    @SerializedName("arena")
    @Expose
    private Arena arena;
    @SerializedName("clanRank")
    @Expose
    private Integer clanRank;
    @SerializedName("previousClanRank")
    @Expose
    private Integer previousClanRank;
    @SerializedName("donations")
    @Expose
    private Integer donations;
    @SerializedName("donationsReceived")
    @Expose
    private Integer donationsReceived;
    @SerializedName("clanChestPoints")
    @Expose
    private Integer clanChestPoints;
    private final static long serialVersionUID = 6693178717877285680L;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Item withTag(String tag) {
        this.tag = tag;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item withName(String name) {
        this.name = name;
        return this;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Item withRole(String role) {
        this.role = role;
        return this;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public Item withLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
        return this;
    }

    public Integer getExpLevel() {
        return expLevel;
    }

    public void setExpLevel(Integer expLevel) {
        this.expLevel = expLevel;
    }

    public Item withExpLevel(Integer expLevel) {
        this.expLevel = expLevel;
        return this;
    }

    public Integer getTrophies() {
        return trophies;
    }

    public void setTrophies(Integer trophies) {
        this.trophies = trophies;
    }

    public Item withTrophies(Integer trophies) {
        this.trophies = trophies;
        return this;
    }

    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public Item withArena(Arena arena) {
        this.arena = arena;
        return this;
    }

    public Integer getClanRank() {
        return clanRank;
    }

    public void setClanRank(Integer clanRank) {
        this.clanRank = clanRank;
    }

    public Item withClanRank(Integer clanRank) {
        this.clanRank = clanRank;
        return this;
    }

    public Integer getPreviousClanRank() {
        return previousClanRank;
    }

    public void setPreviousClanRank(Integer previousClanRank) {
        this.previousClanRank = previousClanRank;
    }

    public Item withPreviousClanRank(Integer previousClanRank) {
        this.previousClanRank = previousClanRank;
        return this;
    }

    public Integer getDonations() {
        return donations;
    }

    public void setDonations(Integer donations) {
        this.donations = donations;
    }

    public Item withDonations(Integer donations) {
        this.donations = donations;
        return this;
    }

    public Integer getDonationsReceived() {
        return donationsReceived;
    }

    public void setDonationsReceived(Integer donationsReceived) {
        this.donationsReceived = donationsReceived;
    }

    public Item withDonationsReceived(Integer donationsReceived) {
        this.donationsReceived = donationsReceived;
        return this;
    }

    public Integer getClanChestPoints() {
        return clanChestPoints;
    }

    public void setClanChestPoints(Integer clanChestPoints) {
        this.clanChestPoints = clanChestPoints;
    }

    public Item withClanChestPoints(Integer clanChestPoints) {
        this.clanChestPoints = clanChestPoints;
        return this;
    }

}
