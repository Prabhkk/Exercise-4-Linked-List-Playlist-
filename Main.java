public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        // Adding songs to the playlist
        playlist.addSongToBeginning(new Song("Love sick", "Sidhu Moose Wala", 3.5));
        playlist.addSongToBeginning(new Song("Hurry Up", "Arjan Dhillon", 4.2));
        playlist.addSongToEnd(new Song("My Precise", "Amantej Hundal", 3.1));
        playlist.addSongToEnd(new Song("Calm Down", "Rema, Selena Gomez", 2.8));
        playlist.addSongToEnd(new Song("People", "Libiancan", 5.1));
        playlist.addSongToEnd(new Song("Runaway", "Aurora", 4.1));

        // Print the initial playlist
        System.out.println(" Printing the initial Playlist.");

        playlist.printPlaylist();

        // Removing a song from the beginning and print the updated playlist
        playlist.removeSongFromBeginning();
        System.out.println(" Printing the Playlist after removing a song from the beginning.");

        playlist.printPlaylist();

        // Removing a song from the end and print the updated playlist
        playlist.removeSongFromEnd();
        System.out.println(" Printing the Playlist after removing a song from the end.");
        playlist.printPlaylist();

        // Shuffle the playlist and print the shuffled playlist
        playlist.shufflePlaylist();
        System.out.println(" Printing the Playlist after shuffling.");
        playlist.printPlaylist();
    }
}

