import java.util.ArrayList;

public class MusicLibrary {
    private ArrayList<String> tracks;
    private ArrayList<Playlist> playlists;
    private String playlistName;
    private String username;

    public MusicLibrary(String library, String username) {
        tracks = new ArrayList<>();
        playlists = new ArrayList<>();
        this.playlistName = playlistName;
        this.username = username;
    }

    public void addTrack(String track) {
        if (!tracks.contains(track)) {
            this.tracks.add(track);
        } else {
            System.out.println("Track already exists in music library");
        }
    }

    public void removeTrack(String track) {
        boolean isRemoved = this.tracks.remove(track);
        if (!isRemoved) {
            System.out.println("Track does not exist in music library");
        } else {
            System.out.println("track removed from music library");
            for (Playlist playlist : playlists) {
                playlist.removeTrack(track);
            }
        }
    }

    public void displayTracks() {
        System.out.println("Tracks in music library: ");
        for (String track : tracks) {
            if (this.tracks.isEmpty()) {
                System.out.println("No tracks found");
            } else {
                System.out.println(tracks);
            }
        }
    }

    public Playlist findPlaylist(String playlistName) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equalsIgnoreCase(playlistName)) {
                return playlist;
            }
        }
        return null;
    }

    public void createPlaylist(String playlistName) {
        Playlist existingPlaylist = this.findPlaylist(playlistName);
        if (existingPlaylist != null) {
            System.out.println("Playlist already exists in music library");
        } else {
            this.playlists.add(new Playlist(playlistName));
        }
    }

    public void addTrackToPlaylist(String trackName, String playlistName) {
        if (this.tracks.contains(trackName)) {
            Playlist existingPlaylist = this.findPlaylist(playlistName);
            if (existingPlaylist != null) {
                existingPlaylist.addTrack(trackName);
            } else {
                System.out.println("Playlist is not found");
            }
        } else {
            System.out.println("Track is not found");
        }
    }

    public void displayPlaylist(String playlistName) {
        var existingPlaylist = this.findPlaylist(playlistName);
        if (existingPlaylist != null) {
            existingPlaylist.display();
        } else {
            System.out.println("Playlist does not exist in music library");
        }
    }

    public void displayAllPlaylists() {
        for (Playlist playlist : playlists) {
           playlist.display();
        }
    }

    public void searchTracks(String trackName) {
        boolean found = false;
        for (String track : tracks){
            if (track.toLowerCase().contains(trackName.toLowerCase())){
                System.out.println("Found track: " + track);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No tracks found");
        }
    }
    public int getTrackCount() {
        return this.tracks.size();
    }

    public int getPlaylistCount() {
        return this.playlists.size();
    }
}

