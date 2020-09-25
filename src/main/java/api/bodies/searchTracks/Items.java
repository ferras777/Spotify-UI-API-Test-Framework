package api.bodies.searchTracks;

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
    public List<Artist_> artists = null;

    @SerializedName("disc_number")
    public Integer discNumber;

    @SerializedName("duration_ms")
    public Integer durationMs;

    @SerializedName("explicit")
    public Boolean explicit;

    @SerializedName("external_ids")
    public ExternalIds externalIds;

    @SerializedName("external_urls")
    public ExternalUrls___ externalUrls;

    @SerializedName("href")
    public String href;

    @SerializedName("id")
    public String id;

    @SerializedName("is_local")
    public Boolean isLocal;

    @SerializedName("is_playable")
    public Boolean isPlayable;

    @SerializedName("name")
    public String name;

    @SerializedName("popularity")
    public Integer popularity;

    @SerializedName("preview_url")
    public Object previewUrl;

    @SerializedName("track_number")
    public Integer trackNumber;

    @SerializedName("type")
    public String type;

    @SerializedName("uri")
    public String uri;
}
