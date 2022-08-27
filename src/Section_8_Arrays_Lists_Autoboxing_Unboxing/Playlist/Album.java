package Section_8_Arrays_Lists_Autoboxing_Unboxing.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) {
            System.out.println("Song " + title + " already exists.");
            return songs.add(new Song(title, duration));
        }
        // System.out.println("Song " + title + " does not exist.");
        return false;
    }

    private Song findSong(String title) {
        System.out.println("findSong(" + title + ")");
        System.out.println(songs.size());

        if (songs.isEmpty()) {
            return null;
        }

        for(int i = 0; i < songs.size(); i++) {
            System.out.println("Não entrou no loop");
            String currentSongTitle = songs.get(i).getTitle();
            System.out.println("Current song title " + currentSongTitle.toUpperCase());
            if (currentSongTitle.equals(title)) {
                System.out.println("Song " + title + " already exists.");
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(int albumTrackNumber, LinkedList<Song> playList) {
        if (albumTrackNumber < 1 || albumTrackNumber > songs.size()) {
            System.out.println("trackNumber is out of bounds");
            return false;
        }
        Song songToAdd = songs.get(albumTrackNumber - 1);
        if(findSong(songToAdd.getTitle()) != null) {
            playList.add(albumTrackNumber - 1, songToAdd);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songName, LinkedList<Song> playlist) {
        System.out.println("Adding song to playlist..");
        Song songToAdd = findSong(songName);
        if (songToAdd != null) {
            System.out.println("Song " + songToAdd.getTitle() + " was added to playlist.");
            return playlist.add(songToAdd);
        }
        return false;
    }
}
