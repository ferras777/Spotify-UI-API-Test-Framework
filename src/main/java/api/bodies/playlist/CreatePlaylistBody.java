package api.bodies.playlist;

import lombok.Builder;

@Builder
public class CreatePlaylistBody {

    //todo refactor fields
    //todo implement interface
    private final String name;
    @Builder.Default private final String description = "New playlist";

    @Builder.Default private final String _public = "false";

    @Override
    public String toString() {
        return "{ \"name\": \""+ name + "\", \"description\":" +
                " \"" + description +"\", \"public\": " +
                "" + _public + " }";
    }
}
