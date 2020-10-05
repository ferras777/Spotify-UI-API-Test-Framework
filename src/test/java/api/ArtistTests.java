package api;

import api.asserts.ArtistAsserts;
import api.bodies.artist.ArtistBody;
import api.enums.Artists;
import api.requests.ArtistRequests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static api.enums.Artists.*;

public class ArtistTests {

    ArtistRequests artistRequests = new ArtistRequests();
    ArtistAsserts artistAsserts = new ArtistAsserts();

    @DataProvider(parallel = true)
    public Object[][] artists() {
        return new Object[][]{
                {PITBULL},
                {FALLING_IN_REVERSE},
                {METALLICA}
        };
    }

    @Test(threadPoolSize = 30, invocationCount = 3, invocationTimeOut = 1000,
            description = "Check right name of artist", dataProvider = "artists")
    public void checkRightNameOfArtistParallelTest(Artists artist) {
        ArtistBody response = artistRequests.
                getAnArtist(artist.getID()).as(ArtistBody.class);

        artistAsserts.checkResponseRightName(response, artist);
    }
}
