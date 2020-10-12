package api.asserts;

import api.bodies.search_tracks.ItemsBody;
import api.bodies.search_tracks.SearchTrackBody;

import static org.testng.Assert.assertTrue;

public class SearchTracksAsserts {

    public void checkTrackNameContainsSearchString(SearchTrackBody searchTrackBody, String searchString) {
        for (ItemsBody itemsBody : searchTrackBody.getTracks().getItems())
            assertTrue(itemsBody.getName().toLowerCase().
                    contains(searchString.toLowerCase()), "Track not contains search string");
    }
}
