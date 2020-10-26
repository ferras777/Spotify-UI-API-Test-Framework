package api.bodies.album;

import api.bodies.artist.ArtistBody;
import api.bodies.common.ExternalUrlsCommonBody;
import api.bodies.common.ImageCommonBody;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class AlbumBody {

    @SerializedName("album_type")
    private String album_type;

    @SerializedName("artists")
    private List<ArtistBody> artists;

    @SerializedName("available_markets")
    private List<String> available_markets;

    @SerializedName("external_urls")
    private ExternalUrlsCommonBody external_urls;

    @SerializedName("href")
    private String href;

    @SerializedName("id")
    private String id;

    @SerializedName("images")
    private List<ImageCommonBody> images;

    @SerializedName("name")
    private String name;

    @SerializedName("release_date")
    private String release_date;

    @SerializedName("release_date_precision")
    private String release_date_precision;

    @SerializedName("total_tracks")
    private Integer total_tracks;

    @SerializedName("type")
    private String type;

    @SerializedName("uri")
    private String uri;
}
