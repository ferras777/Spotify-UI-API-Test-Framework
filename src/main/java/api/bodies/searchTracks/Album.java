package api.bodies.searchTracks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Album {

    @SerializedName("album_type")
    @Expose(deserialize = false)
    public String albumType;

    @SerializedName("artists")
    public List<Artist> artists = null;

    @SerializedName("external_urls")
    public ExternalUrls_ externalUrls;

    @SerializedName("href")
    public String href;

    @SerializedName("id")
    public String id;

    @SerializedName("images")
    public List<Image> images = null;

    @SerializedName("name")
    public String name;

    @SerializedName("release_date")
    public String releaseDate;

    @SerializedName("release_date_precision")
    public String releaseDatePrecision;

    @SerializedName("total_tracks")
    public Integer totalTracks;

    @SerializedName("type")
    public String type;

    @SerializedName("uri")
    public String uri;
}
