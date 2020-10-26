package api;
import api.requests.PlaylistRequests;
import org.testng.annotations.Test;

public class PlaylistTests {
    PlaylistRequests playlistRequests = new PlaylistRequests();

    //TODO: complete tests
    @Test(description="Create playlist and check if it created")
    public void createPlaylistAndCheckIfItCreated() {
        playlistRequests.createAPlaylist("First playlist");
//        playlistRequests.getAListOfUserPlaylists().as(UserPlaylists.class).getName();
    }
}
