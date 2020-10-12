package api.bodies.common;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class ExternalUrlsCommonBody {

    @SerializedName("spotify")
    private String spotify;
}
