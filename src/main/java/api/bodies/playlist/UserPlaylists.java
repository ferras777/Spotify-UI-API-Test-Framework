package api.bodies.playlist;

import api.bodies.common.CommonBody;
import api.bodies.common.ExternalUrlsCommonBody;
import api.enums.Tracks;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.wrapper.spotify.model_objects.specification.Followers;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.security.acl.Owner;
import java.util.List;

@Getter
@NoArgsConstructor
public class UserPlaylists extends CommonBody {
    @SerializedName("collaborative")
    @Expose
    public Boolean collaborative;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("external_urls")
    @Expose
    public ExternalUrlsCommonBody external_urls;
    @SerializedName("followers")
    @Expose
    public Followers followers;
    @SerializedName("images")
    @Expose
    public List<Object> images;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("owner")
    @Expose
    public Owner owner;
    @SerializedName("primary_color")
    @Expose
    public Object primaryColor;
    @SerializedName("public")
    @Expose
    public Boolean _public;
    @SerializedName("snapshot_id")
    @Expose
    public String snapshotId;
    @SerializedName("tracks")
    @Expose
    public Tracks tracks;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("uri")
    @Expose
    public String uri;

}
