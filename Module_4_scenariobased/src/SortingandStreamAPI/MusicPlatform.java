package SortingandStreamAPI;
import java.util.*;
import java.util.stream.*;

class Song {
    String title;
    String artist;
    int duration; // in seconds

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
}

public class MusicPlatform {
    public static void main(String[] args) {
        List<Song> songs = Arrays.asList(
            new Song("Skyline", "Aria", 180),
            new Song("Echoes", "Nova", 220),
            new Song("Midnight Drive", "Pulse", 190),
            new Song("Ocean Waves", "Luna", 250)
        );

        List<String> longSongs = songs.stream()
            .filter(song -> song.duration > 180)
            .map(song -> song.title)
            .collect(Collectors.toList());

        System.out.println("Songs longer than 3 minutes:");
        longSongs.forEach(System.out::println);
    }
}
