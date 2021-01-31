package api.bodies.playlist;

import lombok.Builder;

@Builder
public class CreatePlaylistBody {

    private final String name;
    @Builder.Default private final String description = "New playlist";

    @Builder.Default private final String _public = "false";
}
