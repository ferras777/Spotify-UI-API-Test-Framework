package api;
import api.bodies.playlist.UserPlaylistsBody;
import api.requests.PlaylistRequests;
import org.testng.annotations.Test;

public class PlaylistTests {
    PlaylistRequests playlistRequests = new PlaylistRequests();

    //TODO: complete tests
    @Test(description="Create playlist and check if it created")
    public void createPlaylistAndCheckIfItCreated() {
        playlistRequests.createAPlaylist("First playlist");
        UserPlaylistsBody userPlaylistsBody= playlistRequests.getListOfUserPlaylists().as(UserPlaylistsBody.class);
    }
}
