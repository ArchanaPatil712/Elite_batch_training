package com.mmcoe.team;

import java.util.ArrayList;

public class IPLSystem {
    public ArrayList<Team> allTeams = new ArrayList<>();
    public ArrayList<Player> auctionPool = new ArrayList<>();

    // 1. Player Search Function
    public Player searchPlayer(String name) throws Exception {
        for (Player p : auctionPool) {
            if (p.name.equalsIgnoreCase(name)) {
                System.out.println("PLAYER FOUND: " + p.name);
                return p;
            }
        }
        throw new Exception("PLAYER NOT FOUND: " + name);
    }

    // 2. Team Search Function
    public Team searchTeam(String name) throws Exception {
        for (Team t : allTeams) {
            if (t.teamName.equalsIgnoreCase(name)) {
                System.out.println("TEAM FOUND: " + t.teamName);
                return t;
            }
        }
        throw new Exception("TEAM NOT FOUND: " + name);
    }

    // 3. Buy Player Function (Billing + Allocation)
    public void buyPlayer(String teamName, String playerName) throws Exception {
        Team t = searchTeam(teamName);   
        Player p = searchPlayer(playerName); 

        if (t.budget < p.price) {
            throw new Exception("INSUFFICIENT BUDGET! " + teamName + " ke paas paise nahi hain.");
        }

        t.addPlayer(p);          
        auctionPool.remove(p);   
        System.out.println("SUCCESS: " + p.name + " bought by " + t.teamName + "\n");
    }

   
    public void showSquad(String teamName) throws Exception {
        Team t = searchTeam(teamName);
        System.out.println("--- " + t.teamName + " Squad ---");
        for (Player p : t.teamPlayers) {
            System.out.println("- " + p.name + " (" + p.price + " Cr)");
        }
        System.out.println("Remaining Budget: " + t.budget + " Cr\n");
    }
}