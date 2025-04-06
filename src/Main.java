//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MusicLibrary myLibrary = new MusicLibrary("Rock Collection",
                "John Smith");

        myLibrary.addTrack("Led Zeppelin - Stairway to Heaven");
        myLibrary.addTrack("Queen - Bohemian Rhapsody");
        myLibrary.addTrack("Pink Floyd - Comfortably Numb");
        myLibrary.addTrack("AC/DC - Back in Black");
        myLibrary.addTrack("Metallica - Nothing Else Matters");

        myLibrary.displayTracks();

        myLibrary.createPlaylist("Favorites");
        myLibrary.createPlaylist("Party");

        myLibrary.addTrackToPlaylist("Queen - Bohemian Rhapsody",
                "Favorites");
        myLibrary.addTrackToPlaylist("Pink Floyd - Comfortably Numb",
                "Favorites");
        myLibrary.addTrackToPlaylist("AC/DC - Back in Black", "Party");
        myLibrary.addTrackToPlaylist("Metallica - Nothing Else Matters",
                "Party");

        myLibrary.displayAllPlaylists();

        myLibrary.displayPlaylist("Favorites");

        myLibrary.searchTracks("Queen");

        myLibrary.removeTrack("AC/DC - Back in Black");

        myLibrary.displayPlaylist("Party");
        System.out.println("Total number of tracks in the library: " +
                myLibrary.getTrackCount());
        System.out.println("Total number of playlists: " +
                myLibrary.getPlaylistCount());

    }
}