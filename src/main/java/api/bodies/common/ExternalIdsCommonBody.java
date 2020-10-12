package api.bodies.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ExternalIdsCommonBody {

    @SerializedName("isrc")
    @Expose
    private String isrc;
}
