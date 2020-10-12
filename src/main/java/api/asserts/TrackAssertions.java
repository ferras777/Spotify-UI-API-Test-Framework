package api.asserts;

import api.bodies.track.TrackBody;

import static api.utils.Utils.getContentTypeofDownloadFile;
import static org.testng.Assert.assertEquals;

public class TrackAssertions {
    public void checkContentTypeIsAudio(TrackBody trackBody) {
        String contentType = getContentTypeofDownloadFile(trackBody);

        assertEquals("audio/mpeg", contentType, "Wrong content type");
    }
}
