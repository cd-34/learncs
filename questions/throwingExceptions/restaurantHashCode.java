import java.util.Objects;

public class Restaurant {
    private String id;
    private String name;
    private String cuisine;

    public Restaurant(String setId, String setName, String setCuisine) {
        if (setId == null || setName == null || setCuisine == null) {
            throw new IllegalArgumentException();
        }
        id = setId;
        name = setName;
        cuisine = setCuisine;
    }

    public int hashCode() {
        return Objects.hash(id, name);
    }
}