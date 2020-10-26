package api.bodies.common;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ImageCommonBody {

    @SerializedName("height")
    private Integer height;

    @SerializedName("url")
    private String url;

    @SerializedName("width")
    private Integer width;
}
