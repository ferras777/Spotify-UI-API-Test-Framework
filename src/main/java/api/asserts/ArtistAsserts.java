package api.asserts;

import api.bodies.artist.ArtistBody;
import api.enums.Artists;

import static org.testng.Assert.assertEquals;

//TODO static import
//TODO java code convention
public class ArtistAsserts {

    public void checkResponseRightName(ArtistBody actualArtistBody, Artists artist) {
        assertEquals(actualArtistBody.getName(), artist.getNAME(), "Wrong name of artist");
    }
}
