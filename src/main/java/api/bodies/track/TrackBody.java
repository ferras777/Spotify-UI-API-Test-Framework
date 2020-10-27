package api.bodies.track;

import api.bodies.album.AlbumBody;
import api.bodies.artist.ArtistBody;
import api.bodies.common.CommonBody;
import api.bodies.common.ExternalIdsCommonBody;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class TrackBody extends CommonBody {

    @SerializedName("album")
    private AlbumBody album;

    @SerializedName("artists")
    private List<ArtistBody> artists;

    @SerializedName("available_markets")
    private List<String> available_markets;

    @SerializedName("disc_number")
    private Integer disc_number;

    @SerializedName("duration_ms")
    private Integer duration_ms;

    @SerializedName("explicit")
    private Boolean explicit;

    @SerializedName("external_ids")
    private ExternalIdsCommonBody external_ids;

    @SerializedName("is_local")
    private Boolean is_local;

    @SerializedName("is_playable")
    private Boolean is_playable;

    @SerializedName("popularity")
    private Integer popularity;

    @SerializedName("track_number")
    private Integer track_number;

    @SerializedName("type")
    private String type;

    @SerializedName("uri")
    private String uri;
}
