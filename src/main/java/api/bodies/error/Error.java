package api.bodies.error;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Error {

    @SerializedName("status")
    private int status;

    @SerializedName("message")
    private String message;
}
