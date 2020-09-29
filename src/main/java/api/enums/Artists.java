package api.enums;


import lombok.Getter;

@Getter
public enum Artists {

    PITBULL("Pitbull","0TnOYISbd1XYRBk9myaseg");

    String NAME;
    String ID;

    Artists(String NAME, String ID) {
        this.NAME = NAME;
        this.ID = ID;
    }
}
