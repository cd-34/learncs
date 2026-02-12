public class Whisperer {
    public static String whisper(Pet input) {
        if (input instanceof Cat) {
            Cat other = (Cat) input;
            return other.meow();
        }
        if (input instanceof Dog) {
            Dog other = (Dog) input;
            return other.woof();
        }
        if (input instanceof Snake) {
            Snake other = (Snake) input;
            return other.hiss();
        }
        return null;
    }
}