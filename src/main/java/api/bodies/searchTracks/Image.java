
package api.bodies.searchTracks;

import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("height")
    public Integer height;

    @SerializedName("url")
    public String url;

    @SerializedName("width")
    public Integer width;
}
