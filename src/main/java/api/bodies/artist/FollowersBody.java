package api.bodies.artist;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FollowersBody {

    @SerializedName("href")
    private String href;

    @SerializedName("total")
    private int total;
}
