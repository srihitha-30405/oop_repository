package JavaGenerics;

import java.util.*;

class Team<T> {
    private List<T> players = new ArrayList<>();

    public void addPlayer(T player) {
        players.add(player);
    }

    public void displayPlayers() {
        players.forEach(System.out::println);
    }
}

public class SportsTeams {
    public static void main(String[] args) {
        Team<String> cricketTeam = new Team<>();
        cricketTeam.addPlayer("Virat Kohli");
        cricketTeam.addPlayer("Rohit Sharma");

        Team<String> footballTeam = new Team<>();
        footballTeam.addPlayer("Lionel Messi");
        footballTeam.addPlayer("Cristiano Ronaldo");

        System.out.println("Cricket Team:");
        cricketTeam.displayPlayers();

        System.out.println("\nFootball Team:");
        footballTeam.displayPlayers();
    }
}

