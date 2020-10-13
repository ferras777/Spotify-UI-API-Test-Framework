package api.bodies.artist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;


//todo use objects instead of primitives
@Getter
@NoArgsConstructor
public class FollowersBody {

    @SerializedName("href")
    @Expose
    private String href;

    @SerializedName("total")
    @Expose
    private Integer total;
}
