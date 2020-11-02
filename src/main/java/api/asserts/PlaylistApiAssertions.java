package api.asserts;
import api.bodies.playlist.PlaylistPageBody;
import io.qameta.allure.Step;

import static org.testng.Assert.assertEquals;

public class PlaylistApiAssertions {

    @Step
    public static void checkIfPlaylistCreatedWithRightName(String nameOfPlaylist, PlaylistPageBody playlistPageBody) {
        assertEquals(nameOfPlaylist, playlistPageBody.getItems().get(0).getName());
    }
}
