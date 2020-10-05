package api.bodies.search_tracks;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Items {

    @SerializedName("album")
    public Album album;

    @SerializedName("artists")
    public List<Artist> artists;

    @SerializedName("disc_number")
    public Integer disc_number;

    @SerializedName("duration_ms")
    public Integer duration_ms;

    @SerializedName("explicit")
    public Boolean explicit;

    @SerializedName("external_ids")
    public ExternalIds external_ids;

    @SerializedName("external_urls")
    public ExternalUrls external_urls;

    @SerializedName("href")
    public String href;

    @SerializedName("id")
    public String id;

    @SerializedName("is_local")
    public Boolean is_local;

    @SerializedName("is_playable")
    public Boolean is_playable;

    @SerializedName("name")
    public String name;

    @SerializedName("popularity")
    public Integer popularity;

    @SerializedName("preview_url")
    public Object preview_url;

    @SerializedName("track_number")
    public Integer track_number;

    @SerializedName("type")
    public String type;

    @SerializedName("uri")
    public String uri;
}
