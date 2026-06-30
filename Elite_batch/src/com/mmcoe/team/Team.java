package com.mmcoe.team;

import java.util.ArrayList;

public class Team {
    public String teamName;
    public int budget;
    public ArrayList<Player> teamPlayers = new ArrayList<>(); 

    public Team(String teamName, int budget) {
        this.teamName = teamName;
        this.budget = budget;
    }

   
    public void addPlayer(Player p) {
        teamPlayers.add(p);
        this.budget = this.budget - p.price; 
    }
}