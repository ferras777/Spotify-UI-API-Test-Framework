
package api.bodies.searchTracks;
import com.google.gson.annotations.SerializedName;


public class Artist {

    @SerializedName("external_urls")
    public ExternalUrls externalUrls;

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
