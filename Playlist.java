import java.util.LinkedList;
import java.util.Collections;
public class Playlist {
    private LinkedList<Song> playlist;

    public Playlist() {
        playlist = new LinkedList<>();
    }

    public void addSongToBeginning(Song song) {
        playlist.addFirst(song);
    }

    public void addSongToEnd(Song song) {
        playlist.addLast(song);
    }

    public void removeSongFromBeginning() {
        if (!playlist.isEmpty()) {
            playlist.removeFirst();
        } else {
            System.out.println("Playlist is empty. No song to remove.");
        }
    }

    public void removeSongFromEnd() {
        if (!playlist.isEmpty()) {
            playlist.removeLast();
        } else {
            System.out.println("Playlist is empty. No song to remove.");
        }
    }

    public void shufflePlaylist() {
        Collections.shuffle(playlist);
    }

    public void printPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }

        System.out.println("Playlist:");
        for (Song song : playlist) {
            System.out.println("Title: " + song.getTitle() + ", Artist: " + song.getArtist() + ", Duration: " + song.getDuration());
        }
    }
}
