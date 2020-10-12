package api.bodies.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class AlbumCommonBody {

    @SerializedName("album_type")
    @Expose
    private String album_type;

    @SerializedName("artists")
    @Expose
    private List<ArtistCommonBody> artists;

    @SerializedName("available_markets")
    @Expose
    private List<String> available_markets;

    @SerializedName("external_urls")
    @Expose
    private ExternalUrlsCommonBody external_urls;

    @SerializedName("href")
    @Expose
    private String href;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("images")
    @Expose
    private List<ImageCommonBody> images;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("release_date")
    @Expose
    private String release_date;

    @SerializedName("release_date_precision")
    @Expose
    private String release_date_precision;

    @SerializedName("total_tracks")
    @Expose
    private Integer total_tracks;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("uri")
    @Expose
    private String uri;
}
