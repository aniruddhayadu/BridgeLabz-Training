package com.gamerzone;

public class GamerZone {

	public static void quickSort(Player[] players, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(players, low, high);

            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
        }
    }
	
	public static int partition(Player[] players, int low, int high) {

        int pivot = players[high].score; 
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (players[j].score > pivot) { 
            	i++;
                Player temp = players[i];
                players[i] = players[j];
                players[j] = temp;
            }
        }
        Player temp = players[i + 1];
        players[i + 1] = players[high];
        players[high] = temp;
        return i + 1;
    }
	
	public static void displayLeaderboard(Player[] players) {

        System.out.println("\n----------------------------------");
        System.out.println("GamerZone Global Leaderboard");
        System.out.println("----------------------------------");

        for (int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + ". " + players[i].playerName + " - Score: " + players[i].score);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player players [] = {
				new Player("Anni", 890),
				new Player("Princi",999),
				new Player("Pinku", 950),
				new Player("Nikki", 799),
				new Player("Golu", 900),
				new Player("Mithun", 930),
				new Player("Titu", 910),
				new Player("Bitti", 992),
				new Player("Antoo", 899),
				new Player("Raja", 932)
		};
		
		quickSort(players, 0, players.length - 1);
        displayLeaderboard(players);
	}

}
