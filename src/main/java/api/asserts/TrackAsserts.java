package api.asserts;

import api.bodies.track.TrackBody;
import api.utils.Utils;

import static org.testng.Assert.assertEquals;

public class TrackAsserts {

    public void checkContentTypeIsAudio(TrackBody trackBody) {
        String contentType = Utils.getContentTypeofDownloadFile(trackBody);

        assertEquals("audio/mpeg", contentType, "Wrong content type");
    }
}
