package api.bodies.artist;

import api.bodies.common.ExternalUrlsCommonBody;
import api.bodies.common.ImageCommonBody;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ArtistBody {

    @SerializedName("external_urls")
    private ExternalUrlsCommonBody external_urls;

    @SerializedName("followers")
    private FollowersBody followers;

    @SerializedName("genres")
    private List<String> genres;

    @SerializedName("href")
    private String href;

    @SerializedName("id")
    private String id;

    @SerializedName("imageBodies")
    private List<ImageCommonBody> images;

    @SerializedName("name")
    private String name;

    @SerializedName("popularity")
    private int popularity;

    @SerializedName("type")
    private String type;

    @SerializedName("uri")
    private String uri;
}
