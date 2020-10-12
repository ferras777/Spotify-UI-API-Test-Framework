package api.bodies.track;

import api.bodies.common.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class TrackBody extends CommonBody {

    @SerializedName("album")
    @Expose
    private AlbumCommonBody album;

    @SerializedName("artists")
    @Expose
    private List<ArtistCommonBody> artists;

    @SerializedName("available_markets")
    @Expose
    private List<String> available_markets;

    @SerializedName("disc_number")
    @Expose
    private Integer disc_number;

    @SerializedName("duration_ms")
    @Expose
    private Integer duration_ms;

    @SerializedName("explicit")
    @Expose
    private Boolean explicit;

    @SerializedName("external_ids")
    @Expose
    private ExternalIdsCommonBody external_ids;

    @SerializedName("is_local")
    @Expose
    private Boolean is_local;

    @SerializedName("popularity")
    @Expose
    private Integer popularity;

    @SerializedName("track_number")
    @Expose
    private Integer track_number;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("uri")
    @Expose
    private String uri;
}
