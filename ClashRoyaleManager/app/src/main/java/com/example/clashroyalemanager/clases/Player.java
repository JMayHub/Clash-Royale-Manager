
package com.example.clashroyalemanager.clases;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Player implements Serializable
{

    @SerializedName("tag")
    @Expose
    private String tag;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("expLevel")
    @Expose
    private Integer expLevel;
    @SerializedName("trophies")
    @Expose
    private Integer trophies;
    @SerializedName("bestTrophies")
    @Expose
    private Integer bestTrophies;
    @SerializedName("wins")
    @Expose
    private Integer wins;
    @SerializedName("losses")
    @Expose
    private Integer losses;
    @SerializedName("battleCount")
    @Expose
    private Integer battleCount;
    @SerializedName("threeCrownWins")
    @Expose
    private Integer threeCrownWins;
    @SerializedName("challengeCardsWon")
    @Expose
    private Integer challengeCardsWon;
    @SerializedName("challengeMaxWins")
    @Expose
    private Integer challengeMaxWins;
    @SerializedName("tournamentCardsWon")
    @Expose
    private Integer tournamentCardsWon;
    @SerializedName("tournamentBattleCount")
    @Expose
    private Integer tournamentBattleCount;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("donations")
    @Expose
    private Integer donations;
    @SerializedName("donationsReceived")
    @Expose
    private Integer donationsReceived;
    @SerializedName("totalDonations")
    @Expose
    private Integer totalDonations;
    @SerializedName("warDayWins")
    @Expose
    private Integer warDayWins;
    @SerializedName("clanCardsCollected")
    @Expose
    private Integer clanCardsCollected;
    @SerializedName("clan")
    @Expose
    private Clan clan;
    @SerializedName("arena")
    @Expose
    private Arena arena;
    @SerializedName("leagueStatistics")
    @Expose
    private LeagueStatistics leagueStatistics;
    @SerializedName("badges")
    @Expose
    private List<Badge> badges;
    @SerializedName("achievements")
    @Expose
    private List<Achievement> achievements;
    @SerializedName("cards")
    @Expose
    private List<Card> cards;
    @SerializedName("currentDeck")
    @Expose
    private List<CurrentDeck> currentDeck;
    @SerializedName("currentFavouriteCard")
    @Expose
    private CurrentFavouriteCard currentFavouriteCard;
    @SerializedName("starPoints")
    @Expose
    private Integer starPoints;
    @SerializedName("expPoints")
    @Expose
    private Integer expPoints;
    @SerializedName("legacyTrophyRoadHighScore")
    @Expose
    private Integer legacyTrophyRoadHighScore;
    @SerializedName("currentPathOfLegendSeasonResult")
    @Expose
    private CurrentPathOfLegendSeasonResult currentPathOfLegendSeasonResult;
    @SerializedName("lastPathOfLegendSeasonResult")
    @Expose
    private LastPathOfLegendSeasonResult lastPathOfLegendSeasonResult;
    @SerializedName("bestPathOfLegendSeasonResult")
    @Expose
    private BestPathOfLegendSeasonResult bestPathOfLegendSeasonResult;
    @SerializedName("totalExpPoints")
    @Expose
    private Integer totalExpPoints;
    private final static long serialVersionUID = -4361062216864706393L;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExpLevel() {
        return expLevel;
    }

    public void setExpLevel(Integer expLevel) {
        this.expLevel = expLevel;
    }

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

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getBattleCount() {
        return battleCount;
    }

    public void setBattleCount(Integer battleCount) {
        this.battleCount = battleCount;
    }

    public Integer getThreeCrownWins() {
        return threeCrownWins;
    }

    public void setThreeCrownWins(Integer threeCrownWins) {
        this.threeCrownWins = threeCrownWins;
    }

    public Integer getChallengeCardsWon() {
        return challengeCardsWon;
    }

    public void setChallengeCardsWon(Integer challengeCardsWon) {
        this.challengeCardsWon = challengeCardsWon;
    }

    public Integer getChallengeMaxWins() {
        return challengeMaxWins;
    }

    public void setChallengeMaxWins(Integer challengeMaxWins) {
        this.challengeMaxWins = challengeMaxWins;
    }

    public Integer getTournamentCardsWon() {
        return tournamentCardsWon;
    }

    public void setTournamentCardsWon(Integer tournamentCardsWon) {
        this.tournamentCardsWon = tournamentCardsWon;
    }

    public Integer getTournamentBattleCount() {
        return tournamentBattleCount;
    }

    public void setTournamentBattleCount(Integer tournamentBattleCount) {
        this.tournamentBattleCount = tournamentBattleCount;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getDonations() {
        return donations;
    }

    public void setDonations(Integer donations) {
        this.donations = donations;
    }

    public Integer getDonationsReceived() {
        return donationsReceived;
    }

    public void setDonationsReceived(Integer donationsReceived) {
        this.donationsReceived = donationsReceived;
    }

    public Integer getTotalDonations() {
        return totalDonations;
    }

    public void setTotalDonations(Integer totalDonations) {
        this.totalDonations = totalDonations;
    }

    public Integer getWarDayWins() {
        return warDayWins;
    }

    public void setWarDayWins(Integer warDayWins) {
        this.warDayWins = warDayWins;
    }

    public Integer getClanCardsCollected() {
        return clanCardsCollected;
    }

    public void setClanCardsCollected(Integer clanCardsCollected) {
        this.clanCardsCollected = clanCardsCollected;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public LeagueStatistics getLeagueStatistics() {
        return leagueStatistics;
    }

    public void setLeagueStatistics(LeagueStatistics leagueStatistics) {
        this.leagueStatistics = leagueStatistics;
    }

    public List<Badge> getBadges() {
        return badges;
    }

    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public List<CurrentDeck> getCurrentDeck() {
        return currentDeck;
    }

    public void setCurrentDeck(List<CurrentDeck> currentDeck) {
        this.currentDeck = currentDeck;
    }

    public CurrentFavouriteCard getCurrentFavouriteCard() {
        return currentFavouriteCard;
    }

    public void setCurrentFavouriteCard(CurrentFavouriteCard currentFavouriteCard) {
        this.currentFavouriteCard = currentFavouriteCard;
    }

    public Integer getStarPoints() {
        return starPoints;
    }

    public void setStarPoints(Integer starPoints) {
        this.starPoints = starPoints;
    }

    public Integer getExpPoints() {
        return expPoints;
    }

    public void setExpPoints(Integer expPoints) {
        this.expPoints = expPoints;
    }

    public Integer getLegacyTrophyRoadHighScore() {
        return legacyTrophyRoadHighScore;
    }

    public void setLegacyTrophyRoadHighScore(Integer legacyTrophyRoadHighScore) {
        this.legacyTrophyRoadHighScore = legacyTrophyRoadHighScore;
    }

    public CurrentPathOfLegendSeasonResult getCurrentPathOfLegendSeasonResult() {
        return currentPathOfLegendSeasonResult;
    }

    public void setCurrentPathOfLegendSeasonResult(CurrentPathOfLegendSeasonResult currentPathOfLegendSeasonResult) {
        this.currentPathOfLegendSeasonResult = currentPathOfLegendSeasonResult;
    }

    public LastPathOfLegendSeasonResult getLastPathOfLegendSeasonResult() {
        return lastPathOfLegendSeasonResult;
    }

    public void setLastPathOfLegendSeasonResult(LastPathOfLegendSeasonResult lastPathOfLegendSeasonResult) {
        this.lastPathOfLegendSeasonResult = lastPathOfLegendSeasonResult;
    }

    public BestPathOfLegendSeasonResult getBestPathOfLegendSeasonResult() {
        return bestPathOfLegendSeasonResult;
    }

    public void setBestPathOfLegendSeasonResult(BestPathOfLegendSeasonResult bestPathOfLegendSeasonResult) {
        this.bestPathOfLegendSeasonResult = bestPathOfLegendSeasonResult;
    }

    public Integer getTotalExpPoints() {
        return totalExpPoints;
    }

    public void setTotalExpPoints(Integer totalExpPoints) {
        this.totalExpPoints = totalExpPoints;
    }

}
