package api.bodies.playlist;

import api.bodies.artist.FollowersBody;
import api.bodies.common.CommonBody;
import api.bodies.common.ExternalUrlsCommonBody;
import api.bodies.common.ImageCommonBody;
import api.bodies.track.TrackBody;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class UserPlaylistsBody extends CommonBody {

    @SerializedName("collaborative")
    @Expose
    private boolean collaborative;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("external_urls")
    @Expose
    private ExternalUrlsCommonBody external_urls;

    @SerializedName("followers")
    @Expose
    private FollowersBody followers;

    @SerializedName("images")
    @Expose
    private List<ImageCommonBody> images;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("owner")
    @Expose
    private OwnerBody owner;

    @SerializedName("primary_color")
    @Expose
    private String primary_color;

    @SerializedName("public")
    private boolean _public;

    @SerializedName("snapshot_id")
    @Expose
    private String snapshot_id;

    @SerializedName("tracks")
    @Expose
    private TrackBody tracks;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("uri")
    @Expose
    private String uri;
}
