public class Copier {
    public static Object[] copy(Object[] input) {
        if (input == null) {
            return null;
        }
    }
    Object[] newArray = new Object[input.length];
    for (int i = 0; i < input.length; i++) {
        newArray[i] = input[i];
    }
    return newArray;
}