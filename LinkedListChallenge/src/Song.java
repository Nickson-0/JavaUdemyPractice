import java.util.ArrayList;
import java.util.LinkedList;

public class Song {

    private String title;
    private double duration;
    private String artist;


    public Song(String title, double duration, String artist) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "'" + this.title + "'" +  " by " + this.artist + ": " + this.duration + " mins.";
    }
}
