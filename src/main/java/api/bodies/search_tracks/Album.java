package api.bodies.search_tracks;

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
    public String album_type;

    @SerializedName("artists")
    public List<Artist> artists;

    @SerializedName("external_urls")
    public ExternalUrls external_urls;

    @SerializedName("href")
    public String href;

    @SerializedName("id")
    public String id;

    @SerializedName("images")
    public List<Image> images;

    @SerializedName("name")
    public String name;

    @SerializedName("release_date")
    public String release_date;

    @SerializedName("release_date_precision")
    public String release_date_precision;

    @SerializedName("total_tracks")
    public Integer total_tracks;

    @SerializedName("type")
    public String type;

    @SerializedName("uri")
    public String uri;
}
