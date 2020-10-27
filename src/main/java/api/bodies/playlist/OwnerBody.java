package api.bodies.playlist;
import api.bodies.common.ExternalUrlsCommonBody;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class OwnerBody {

    @SerializedName("display_name")
    @Expose
    private String display_name;

    @SerializedName("external_urls")
    @Expose
    private ExternalUrlsCommonBody external_urls;

    @SerializedName("href")
    @Expose
    private String href;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("uri")
    @Expose
    private String uri;
}
