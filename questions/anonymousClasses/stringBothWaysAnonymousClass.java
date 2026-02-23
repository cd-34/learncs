public class BothWays {
    public static IBothWays create(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }

        return new IBothWays() {
            public String forward() {
                return input;
            }

            public String backward() {
                String result = "";
                for (int i = input.length() - 1; i >= 0; i--) {
                    result += input.charAt(i);
                }
                return result;
            }
        }; // note the ; matches the closing } from the return statement
    }
}