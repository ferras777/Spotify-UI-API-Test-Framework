package api;

import api.requests.PlaylistRequests;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static api.asserts.PlaylistApiAssertions.checkIfPlaylistCreatedWithRightName;

public class PlaylistTests {

    PlaylistRequests playlistRequests = new PlaylistRequests();

    @Epic(value = "Плейлист")
    @Feature(value = "Проверка плейлиста через API")
    @Stories(value = {@Story(value = "Создание плейлиста"),
            @Story(value = "Проверка создания плейлиста")})
    @Test(description = "Create playlist and check if it created", groups = {"createPlaylist"})
    public void createPlaylistAndCheckIfItCreated() {
        String name = "first";

        playlistRequests.createPlaylist(name);

        checkIfPlaylistCreatedWithRightName(name, playlistRequests.getUserPlaylistsPageBody());
    }
}
