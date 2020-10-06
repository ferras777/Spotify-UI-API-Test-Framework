package api.bodies.artist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//TODO delete duplicated bodies
@Getter
@Setter
@NoArgsConstructor
public class Image {

    @SerializedName("height")
    @Expose
    public int height;

    @SerializedName("url")
    @Expose
    public String url;

    @SerializedName("width")
    @Expose
    public int width;
}
