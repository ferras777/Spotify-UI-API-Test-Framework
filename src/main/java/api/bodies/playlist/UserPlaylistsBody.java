package api.bodies.playlist;

import api.bodies.common.CommonBody;
import api.bodies.common.ExternalUrlsCommonBody;
import api.enums.Tracks;
import com.google.gson.annotations.SerializedName;
import com.wrapper.spotify.model_objects.specification.Followers;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.security.acl.Owner;
import java.util.List;

@Getter
@NoArgsConstructor
public class UserPlaylistsBody extends CommonBody {

    //TODO: serialize
    @SerializedName("collaborative")
    public Boolean collaborative;

    @SerializedName("description")
    public String description;

    @SerializedName("external_urls")
    public ExternalUrlsCommonBody external_urls;

    @SerializedName("followers")
    public Followers followers;

    @SerializedName("images")
    public List<Object> images;

    @SerializedName("name")
    public String name;

    @SerializedName("owner")
    public Owner owner;

    @SerializedName("primary_color")
    public Object primaryColor;

    @SerializedName("public")
    public Boolean _public;

    @SerializedName("snapshot_id")
    public String snapshotId;

    @SerializedName("tracks")
    public Tracks tracks;

    @SerializedName("type")
    public String type;

    @SerializedName("uri")
    public String uri;

}
