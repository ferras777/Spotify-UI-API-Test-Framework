package api;
import api.requests.PlaylistRequests;
import org.testng.annotations.Test;

import static api.asserts.PlaylistApiAssertions.checkIfPlaylistCreatedWithRightName;

public class PlaylistTests {

    PlaylistRequests playlistRequests = new PlaylistRequests();

    @Test(description = "Create playlist and check if it created")
    public void createPlaylistAndCheckIfItCreated() {
        String name = "first";

        playlistRequests.createPlaylist(name);

        checkIfPlaylistCreatedWithRightName(name, playlistRequests.getUserPlaylistsPageBody());
    }
}
