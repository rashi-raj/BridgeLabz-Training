package com.day8.gamerzone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GamerZone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Player> players = new ArrayList<>();

        System.out.print("Enter number of Players: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // consume newline

            System.out.print("Enter Player Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Score: ");
            int score = sc.nextInt();

            players.add(new Player(name, score));
        }

        // Quick Sort for leaderboard
        QuickSortUtil.quickSort(players, 0, players.size() - 1);

        // Display Leaderboard
        System.out.println("\n===== GAMERZONE LEADERBOARD =====");
        int rank = 1;
        for (Player p : players) {
            System.out.println(rank++ + ". " + p.name + " - " + p.score);
        }

        sc.close();
    }
}
