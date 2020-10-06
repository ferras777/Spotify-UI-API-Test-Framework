package api.bodies.track;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class TrackBody {

    @SerializedName("album")
    @Expose
    public Album album;

    @SerializedName("artists")
    @Expose
    public List<Artist> artists;

    @SerializedName("available_markets")
    @Expose
    public List<String> available_markets;

    @SerializedName("disc_number")
    @Expose
    public Integer disc_number;

    @SerializedName("duration_ms")
    @Expose
    public Integer duration_ms;

    @SerializedName("explicit")
    @Expose
    public Boolean explicit;

    @SerializedName("external_ids")
    @Expose
    public ExternalIds external_ids;

    @SerializedName("external_urls")
    @Expose
    public ExternalUrls external_urls;

    @SerializedName("href")
    @Expose
    public String href;

    @SerializedName("id")
    @Expose
    public String id;

    @SerializedName("is_local")
    @Expose
    public Boolean is_local;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("popularity")
    @Expose
    public Integer popularity;

    @SerializedName("preview_url")
    @Expose
    public String preview_url;

    @SerializedName("track_number")
    @Expose
    public Integer track_number;

    @SerializedName("type")
    @Expose
    public String type;

    @SerializedName("uri")
    @Expose
    public String uri;
}
