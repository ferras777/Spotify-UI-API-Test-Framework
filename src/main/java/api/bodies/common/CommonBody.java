package api.bodies.common;
import api.interfaces.Body;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
//todo delete implements Body
public class CommonBody implements Body {

    @SerializedName("href")
    private String href;

    @SerializedName("id")
    private String id;

    @SerializedName("external_urls")
    private ExternalUrlsCommonBody external_urls;

    @SerializedName("name")
    private String name;

    @SerializedName("preview_url")
    private String preview_url;
}
