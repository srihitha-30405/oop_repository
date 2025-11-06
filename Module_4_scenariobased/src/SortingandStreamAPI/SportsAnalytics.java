package SortingandStreamAPI;

import java.util.*;

class Athlete implements Comparable<Athlete> {
    String name;
    String country;
    double score;

    public Athlete(String name, String country, double score) {
        this.name = name;
        this.country = country;
        this.score = score;
    }

    public int compareTo(Athlete other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return name + " | " + country + " | Score: " + score;
    }
}

public class SportsAnalytics {
    public static void main(String[] args) {
        List<Athlete> athletes = Arrays.asList(
            new Athlete("Zara", "India", 88.5),
            new Athlete("Alex", "USA", 92.0),
            new Athlete("Brian", "UK", 85.0)
        );

        System.out.println("Sorted by Name (Comparable):");
        Collections.sort(athletes);
        athletes.forEach(System.out::println);

        System.out.println("\nSorted by Score Descending (Comparator):");
        athletes.sort((a1, a2) -> Double.compare(a2.score, a1.score));
        athletes.forEach(System.out::println);
    }
}
