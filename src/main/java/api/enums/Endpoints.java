package api.enums;

public enum Endpoints {

    //todo move base url to config file
    //todo make builder for endpoints
    BASE_URL("https://api.spotify.com/v1/"),
    GET_ARTIST("artists/"),
    GET_TRACK("tracks/"),
    GET_LIST_OF_USER_PLAYLISTS("me/playlists"),
    CREATE_PLAYLIST("users/{user_id}/playlists");

    String path;

    Endpoints(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return this.getPath();
    }
}
