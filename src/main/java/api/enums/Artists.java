package api.enums;

import lombok.Getter;

@Getter
public enum Artists {

    PITBULL("Pitbull", "0TnOYISbd1XYRBk9myaseg"),
    FALLING_IN_REVERSE("Falling In Reverse", "2CmaKO2zEGJ1NWpS1yfVGz"),
    METALLICA("Metallica", "2ye2Wgw4gimLv2eAKyk1NB");

    private final String name;
    private final String id;

    Artists(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
