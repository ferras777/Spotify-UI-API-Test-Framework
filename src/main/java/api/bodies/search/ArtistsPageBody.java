package api.bodies.search;

import api.bodies.artist.ArtistBody;
import api.bodies.common.CommonBody;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ArtistsPageBody extends CommonBody {

    @SerializedName("items")
    private List<ArtistBody> items;

    @SerializedName("limit")
    private Integer limit;

    @SerializedName("next")
    private String next;

    @SerializedName("offset")
    private Integer offset;

    @SerializedName("previous")
    private Object previous;

    @SerializedName("total")
    private Integer total;
}
