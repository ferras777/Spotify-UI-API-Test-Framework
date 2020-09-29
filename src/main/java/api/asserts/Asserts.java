package api.asserts;

import api.bodies.artist.ArtistBody;
import api.bodies.search_tracks.Items;
import api.bodies.search_tracks.SearchTrackBody;
import api.enums.Artists;
import org.testng.Assert;

public class Asserts {

    public void checkResponseRightName(ArtistBody artistBody, Artists artist) {
        Assert.assertEquals(artistBody.getName(), artist.getNAME());
    }

    public void checkTrackNameContainsSearchString(SearchTrackBody searchTrackBody, String searchString) {

        for (Items items: searchTrackBody.getTracks().getItems())
        Assert.assertTrue(items.getName().toLowerCase().
                contains(searchString.toLowerCase()));
    }
}
