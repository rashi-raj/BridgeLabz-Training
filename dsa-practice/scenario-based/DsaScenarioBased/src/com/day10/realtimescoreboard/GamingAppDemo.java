package com.day10.realtimescoreboard;

public class GamingAppDemo {
	public static void main(String[] args) {
        LeaderboardAVL leaderboard = new LeaderboardAVL();
        leaderboard.insert(new Player("Alice", 50));
        leaderboard.insert(new Player("Bob", 70));
        leaderboard.insert(new Player("Charlie", 60));
        leaderboard.insert(new Player("Dave", 80));

        System.out.println("Top 3 Players:");
        leaderboard.displayTop(3);

        System.out.println("\nRemoving Bob (70):");
        leaderboard.delete(70);
        leaderboard.displayTop(3);
    }
}
