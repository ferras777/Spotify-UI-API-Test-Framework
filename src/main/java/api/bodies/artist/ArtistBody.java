package api.bodies.artist;

import api.bodies.common.CommonBody;
import api.bodies.common.ImageCommonBody;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ArtistBody extends CommonBody {
    @SerializedName("followers")
    private FollowersBody followers;

    @SerializedName("genres")
    private List<String> genres;

    @SerializedName("imageBodies")
    private List<ImageCommonBody> images;

    @SerializedName("popularity")
    private int popularity;

    @SerializedName("type")
    private String type;

    @SerializedName("uri")
    private String uri;
}
