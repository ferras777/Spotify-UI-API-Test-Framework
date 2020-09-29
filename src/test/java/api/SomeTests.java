package api;

import api.asserts.Asserts;
import api.bodies.artist.ArtistBody;
import api.bodies.search_tracks.SearchTrackBody;
import api.requests.Requests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static api.enums.Artists.PITBULL;

public class SomeTests {
    Requests requests = new Requests();
    Asserts asserts = new Asserts();

    @Test(description="Check is right name of artist")
    public void checkIsRightNameOfArtist() {
        ArtistBody response = requests.
                getAnArtist(PITBULL.getID()).as(ArtistBody.class);

        Assert.assertEquals(response.getName(),PITBULL.getNAME());

        asserts.checkResponseRightName(response,PITBULL);

    }

    @Test(description = "Search track schema validation")
    public void searchTrackSchemaValidation() {
        requests.
                searchTrackSchemaValidation("SearchTrackSchema.json");
    }

    @Test(description="Search track")
    public void searchTrack() {
        String trackName = "popular";

        SearchTrackBody response = requests.
                searchForTracks(trackName).
                as(SearchTrackBody.class);

        asserts.checkTrackNameContainsSearchString(response, trackName);
    }
}
