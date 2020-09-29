package api.bodies.artist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class  ArtistBody {

    @SerializedName("external_urls")
    @Expose
    public ExternalUrls external_urls;

    @SerializedName("followers")
    @Expose
    public Followers followers;

    @SerializedName("genres")
    @Expose
    public List<String> genres = null;

    @SerializedName("href")
    @Expose
    public String href;

    @SerializedName("id")
    @Expose
    public String id;

    @SerializedName("images")
    @Expose
    public List<Image> images = null;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("popularity")
    @Expose
    public int popularity;

    @SerializedName("type")
    @Expose
    public String type;

    @SerializedName("uri")
    @Expose
    public String uri;
}
