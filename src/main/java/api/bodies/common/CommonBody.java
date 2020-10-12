package api.bodies.common;
import api.interfaces.Body;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static io.restassured.RestAssured.when;

@Getter
@NoArgsConstructor
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

    @Override
    public String getContentTypeofDownloadFile() {
        return when().
                get(getPreview_url()).
                then().
                extract().
                contentType();
    }
}
