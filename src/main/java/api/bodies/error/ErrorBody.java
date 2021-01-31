package api.bodies.error;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class ErrorBody {

    @SerializedName("error")
    private Error error;
}
