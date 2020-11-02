package ui.asserts;

import ui.pages.selenide.WebPlayerPage;

import static org.testng.Assert.assertEquals;

public class PlaylistUIAssertions {

    public static void checkPlaylistsListIsEmpty(WebPlayerPage webPlayerPage) {
        assertEquals(webPlayerPage.getListOfPlaylist().size(), 0);
    }
}
