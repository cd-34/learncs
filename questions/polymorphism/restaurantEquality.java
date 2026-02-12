public class Restaurant {
    private String name;
    private String cuisine;
    private int cap;
    public Restaurant(String setName, String setCuisine, int setCap) {
        assert setName != null && setCuisine != null && setCap > 0;
        name = setName; 
        cuisine = setCuisine;
        cap = setCap;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Restaurant)) {
            return false;
        }
        Restaurant other = (Restaurant) o;
        return other.name.equals(name) && other.cuisine.equals(cuisine);
    }
}