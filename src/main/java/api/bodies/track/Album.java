package api.bodies.track;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class Album {

    @SerializedName("album_type")
    @Expose
    public String album_type;

    @SerializedName("artists")
    @Expose
    public List<Artist> artists;

    @SerializedName("available_markets")
    @Expose
    public List<String> available_markets;

    @SerializedName("external_urls")
    @Expose
    public ExternalUrls external_urls;

    @SerializedName("href")
    @Expose
    public String href;

    @SerializedName("id")
    @Expose
    public String id;

    @SerializedName("images")
    @Expose
    public List<Image> images;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("release_date")
    @Expose
    public String release_date;

    @SerializedName("release_date_precision")
    @Expose
    public String release_date_precision;

    @SerializedName("total_tracks")
    @Expose
    public Integer total_tracks;

    @SerializedName("type")
    @Expose
    public String type;

    @SerializedName("uri")
    @Expose
    public String uri;
}
