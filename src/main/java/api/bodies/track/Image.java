package api.bodies.track;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Image {

    @SerializedName("height")
    @Expose
    public Integer height;

    @SerializedName("url")
    @Expose
    public String url;

    @SerializedName("width")
    @Expose
    public Integer width;
}
