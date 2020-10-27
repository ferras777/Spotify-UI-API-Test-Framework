package api.asserts;
import api.bodies.playlist.PlaylistPageBody;

import static org.testng.Assert.assertEquals;

public class PlaylistAssertions {

    public static void checkIfPlaylistCreatedWithRightName(String nameOfPlaylist, PlaylistPageBody playlistPageBody) {
        assertEquals(nameOfPlaylist, playlistPageBody.getItems().get(0).getName());
    }
}
