public class Lint {
    public static void main(String[] input) {
        if (input[0].equals("--format")) {
            System.out.println("I will fix your style.");
        } else {
            System.out.println("I will complain about your style.");
        }
    }
}