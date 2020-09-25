
package api.bodies.artist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Followers {

    @SerializedName("href")
    @Expose
    public Object href;

    @SerializedName("total")
    @Expose
    public int total;
}
