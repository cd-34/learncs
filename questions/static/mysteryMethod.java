public class Mystery {
    public static String mystery(String str, int input) {
        assert str != null;
        if (input >= 0) {
            if (input > str.length()) {
                // System.out.println("1");
                return str.substring(0, str.length());
            } else {
                // System.out.println("2");
            } return str.substring(0, input);
        } else if (Math.abs(input) > str.length()) {
            // System.out.println("3"); 
            return str;
        } else {
            // System.out.println("4");
            return str.substring(str.length() + input, str.length());
        }
    }
}