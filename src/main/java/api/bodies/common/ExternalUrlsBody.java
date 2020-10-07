package api.bodies.common;

import api.bodies.search_tracks.ExternalUrls;
import com.google.gson.annotations.SerializedName;

public class ExternalUrlsBody {

    @SerializedName("external_urls")
    public ExternalUrls external_urls;
}
