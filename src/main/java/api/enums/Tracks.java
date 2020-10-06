package api.enums;


import lombok.Getter;

@Getter
public enum Tracks {
    HYPE("5tXgNRHlUyfrc7P5GgpwnI"),
    BREAKTHRU("5GIWP2q6p92lFA10KUuL0z"),
    BRIGHTSIDE("1zVuDtGYWtwg2Id64zrL2K");

    String id;

    Tracks(String id) {
        this.id = id;
    }
}
