package api.asserts;

import api.bodies.artist.ArtistBody;
import api.enums.Artists;

import static org.testng.Assert.assertEquals;

public class ArtistAsserts {

    public void checkResponseRightNameArtist(ArtistBody artistBody, Artists artist) {
        assertEquals(artistBody.getName(), artist.getName(), "Wrong name of artist");
    }
}
