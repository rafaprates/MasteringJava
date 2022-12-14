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
            return false;
        }

        songs.add(new Song(title, duration));
        return true;
    }

    private Song findSong(String title) {

        for(int i = 0; i < songs.size(); i++) {
            String currentSongTitle = songs.get(i).getTitle();
            if (currentSongTitle.equals(title)) {
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(int albumTrackNumber, LinkedList<Song> playList) {

        if (albumTrackNumber < 1 || albumTrackNumber > songs.size()) {
            return false;
        }

        Song songToAdd = songs.get(albumTrackNumber - 1);
        if(findSong(songToAdd.getTitle()) != null) {
            playList.add(songToAdd);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songName, LinkedList<Song> playlist) {
        Song songToAdd = findSong(songName);
        if (songToAdd != null) {
            return playlist.add(songToAdd);
        }
        return false;
    }
}
