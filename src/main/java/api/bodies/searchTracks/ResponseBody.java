package api.bodies.searchTracks;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResponseBody {

    @SerializedName("tracks")
    private Tracks tracks;
}
