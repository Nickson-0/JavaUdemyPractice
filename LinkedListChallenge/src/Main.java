import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program that implements a playlist for songs
        // Create a Song class having Title and Duration for a song.
        // The program will have an Album class containing a list of songs.
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()

        Album projectBaby2Album = new Album("project Baby 2", "Kodak Black");
        projectBaby2Album.addSong("Pride", 4.6);
        projectBaby2Album.addSong("Versatile", 5.2);
        projectBaby2Album.addSong("Still in the streets", 3.2);
        projectBaby2Album.addSong("6th sense", 3.6);
        projectBaby2Album.addSong("Don't wanna breathe", 2.3);
        projectBaby2Album.addSong("Misunderstood", 4.2);
        projectBaby2Album.addSong("Legacy", 4);
        projectBaby2Album.addSong("Roll in Peace", 5.1);
        projectBaby2Album.addSong("Recipe", 3);
        albums.add(projectBaby2Album);

        Album heartBreakKodakAlbum = new Album("Heart Break Kodak (HBK)", "Kodak Black");
        heartBreakKodakAlbum.addSong("Running out of love", 4.8);
        heartBreakKodakAlbum.addSong("Bill and Jill", 5.6);
        heartBreakKodakAlbum.addSong("Acting weird", 4);
        heartBreakKodakAlbum.addSong("Why you always gotta go", 3.8);
        heartBreakKodakAlbum.addSong("laudy", 3.1);
        heartBreakKodakAlbum.addSong("I get lonely", 4.5);
        heartBreakKodakAlbum.addSong("Loyal", 2.6);
        albums.add(heartBreakKodakAlbum);

        Album saveMeAlbum = new Album("Save Me", "Future");
        saveMeAlbum.addSong("XanaX Damage", 1.44);
        saveMeAlbum.addSong("St. lucia", 3.18);
        saveMeAlbum.addSong("Shotgun", 4.19);
        saveMeAlbum.addSong("Please tell me", 3.25);
        saveMeAlbum.addSong("Government Official", 2.31);
        saveMeAlbum.addSong("Extra", 2.53);
        albums.add(saveMeAlbum);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlayList("Legacy", playlist);
        albums.get(0).addToPlayList("Pride", playlist);
        albums.get(0).addToPlayList("Roll in Peace", playlist);
        albums.get(1).addToPlayList("Bill and Jill", playlist);
        albums.get(1).addToPlayList("Mad Man", playlist);
        albums.get(1).addToPlayList(1, playlist);
        albums.get(1).addToPlayList(3, playlist);
        albums.get(1).addToPlayList(4, playlist);
        albums.get(1).addToPlayList(5, playlist);
        albums.get(1).addToPlayList(7, playlist);
        albums.get(2).addToPlayList(1, playlist);
        albums.get(2).addToPlayList(2, playlist);
        albums.get(2).addToPlayList(5, playlist);
        albums.get(1).addToPlayList(20, playlist);

        play(playlist);


    }

    private static void play(LinkedList<Song> playList) {
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> songListIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing: " + songListIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (songListIterator.hasNext()) {
                            songListIterator.next();
                        }
                        forward = true;
                    }
                    if (songListIterator.hasNext()) {
                        System.out.println("Now playing " + songListIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward) {
                        if (songListIterator.hasPrevious()) {
                            songListIterator.previous();
                        }
                        forward = false;
                    }
                    if (songListIterator.hasPrevious()) {
                        System.out.println("Now playing " + songListIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (songListIterator.hasPrevious()) {
                            System.out.println("Now replaying " + songListIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (songListIterator.hasNext()) {
                            System.out.println("Now replaying " + songListIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;

                case 6:
                    if (playList.size() > 0) {
                        songListIterator.remove();
                        if (songListIterator.hasNext()) {
                            System.out.println("Now playing " + songListIterator.next());
                        } else if (songListIterator.hasPrevious()) {
                            System.out.println("Now playing " + songListIterator.previous());
                        }
                    }
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");

    }


    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }


}
