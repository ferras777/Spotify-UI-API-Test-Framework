package api.bodies.search_tracks;

import api.bodies.common.AlbumCommonBody;
import api.bodies.common.ArtistCommonBody;
import api.bodies.common.ExternalIdsCommonBody;
import api.bodies.common.ExternalUrlsCommonBody;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ItemsBody {

    @SerializedName("album")
    private AlbumCommonBody album;

    @SerializedName("artists")
    private List<ArtistCommonBody> artists;

    @SerializedName("disc_number")
    private Integer disc_number;

    @SerializedName("duration_ms")
    private Integer duration_ms;

    @SerializedName("explicit")
    private Boolean explicit;

    @SerializedName("external_ids")
    private ExternalIdsCommonBody external_ids;

    @SerializedName("external_urls")
    private ExternalUrlsCommonBody external_urls;

    @SerializedName("href")
    private String href;

    @SerializedName("id")
    private String id;

    @SerializedName("is_local")
    private Boolean is_local;

    @SerializedName("is_playable")
    private Boolean is_playable;

    @SerializedName("name")
    private String name;

    @SerializedName("popularity")
    private Integer popularity;

    @SerializedName("preview_url")
    private Object preview_url;

    @SerializedName("track_number")
    private Integer track_number;

    @SerializedName("type")
    private String type;

    @SerializedName("uri")
    private String uri;
}
