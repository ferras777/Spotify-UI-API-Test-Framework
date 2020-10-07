package api.bodies.artist;

import api.bodies.common.ExternalUrlsBody;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//TODO add body to the name
@Getter
@Setter
@NoArgsConstructor
public class Followers extends ExternalUrlsBody {

    //added object because
    @SerializedName("href")
    @Expose
    public Object href;

    @SerializedName("total")
    @Expose
    public int total;
}
