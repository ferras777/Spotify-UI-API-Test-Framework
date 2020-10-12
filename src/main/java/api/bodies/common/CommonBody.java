package api.bodies.common;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommonBody {

    @SerializedName("href")
    private String href;

    @SerializedName("id")
    private String id;

    @SerializedName("external_urls")
    private ExternalUrlsCommonBody external_urls;

    @SerializedName("name")
    private String name;

    @SerializedName("preview_url")
    @Expose
    private String preview_url;
}
