package api.bodies.search_tracks;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SearchTrackBody {

    @SerializedName("tracks")
    private TracksBody tracks;
}
