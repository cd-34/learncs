public class Orderer {
    public static String order(Restaurant input) {
        if (input instanceof Fancy) {
            return "At " + input.getName() + " I'll order something inexpensive";
        }
        if (input instanceof FastFood) {
            return "At " + input.getName() + " I'll order something healthy";
        }
        if (input instanceof Staff) {
            Vegan veganinstance = (Vegan) input;
            return "At " + input.getName() + "I'll order something delicious " + vegan.getCuisine() + " food";
        }
        return null;
    }
}