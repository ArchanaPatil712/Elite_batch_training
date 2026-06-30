package com.mmcoe.team;

public class Main {
    public static void main(String[] args) {
        IPLSystem ipl = new IPLSystem();

        
        ipl.allTeams.add(new Team("RCB", 25));
        ipl.auctionPool.add(new Player("Virat Kohli", 17));

        
        try {
            
            ipl.buyPlayer("RCB", "Virat Kohli");
            
            
            ipl.showSquad("RCB");

           
            System.out.println("Testing Wrong Search:");
            ipl.searchPlayer("MS Dhoni");

        } catch (Exception e) {
            
            System.out.println("Caught Error: " + e.getMessage());
        }
    }
}
