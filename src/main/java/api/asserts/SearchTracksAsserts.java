package api.asserts;

import api.bodies.search_tracks.Items;
import api.bodies.search_tracks.SearchTrackBody;
import org.testng.Assert;

public class SearchTracksAsserts {
    public void checkTrackNameContainsSearchString(SearchTrackBody searchTrackBody, String searchString) {

        for (Items items : searchTrackBody.getTracks().getItems())
            Assert.assertTrue(items.getName().toLowerCase().
                    contains(searchString.toLowerCase()), "Track not contains search string");
    }
}
