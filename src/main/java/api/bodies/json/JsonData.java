package api.bodies.json;

import lombok.Getter;

@Getter
public class JsonData {

    private String name;
    private String id;

    @Override
    public String toString() {
        return name;
    }
}
