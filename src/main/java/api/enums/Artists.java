package api.enums;


import lombok.Getter;

@Getter
public enum Artists {

    PITBULL("Pitbull", "0TnOYISbd1XYRBk9myaseg"),
    FALLING_IN_REVERSE("Falling In Reverse", "2CmaKO2zEGJ1NWpS1yfVGz"),
    METALLICA("Metallica", "2ye2Wgw4gimLv2eAKyk1NB");

    //TODO variables in lower case
    String NAME;
    String ID;

    Artists(String NAME, String ID) {
        this.NAME = NAME;
        this.ID = ID;
    }
}
