package api.bodies.search_tracks;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Tracks {

    @SerializedName("href")
    public String href;

    @SerializedName("items")
    public List<Items> items;

    @SerializedName("limit")
    public Integer limit;

    @SerializedName("next")
    public String next;

    @SerializedName("offset")
    public Integer offset;

    @SerializedName("previous")
    public Object previous;

    @SerializedName("total")
    public Integer total;
}
