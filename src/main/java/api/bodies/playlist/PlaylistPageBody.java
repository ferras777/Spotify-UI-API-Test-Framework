package api.bodies.playlist;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class PlaylistPageBody {

    @SerializedName("href")
    @Expose
    private String href;

    @SerializedName("items")
    @Expose
    private List<UserPlaylistsBody> items;

    @SerializedName("limit")
    @Expose
    private int limit;

    @SerializedName("next")
    @Expose
    private String next;

    @SerializedName("offset")
    @Expose
    private int offset;

    @SerializedName("previous")
    @Expose
    private String previous;

    @SerializedName("total")
    @Expose
    private int total;
}
