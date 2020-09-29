
package api.bodies.search_tracks;

import com.google.gson.annotations.SerializedName;

public class Artist_ {

    @SerializedName("external_urls")
    public ExternalUrls__ external_urls;

    @SerializedName("href")
    public String href;

    @SerializedName("id")
    public String id;

    @SerializedName("name")
    public String name;

    @SerializedName("type")
    public String type;

    @SerializedName("uri")
    public String uri;
}
