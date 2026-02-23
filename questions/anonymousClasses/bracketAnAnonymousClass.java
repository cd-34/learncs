public class Bracketer {
    public static Bracket create(int input) {
        Bracket other = new Bracket() {
            public int top() {
                return input;
            }

            public int bottom() {
                return -input;
            }
        };
        return other;
    }
}

// alternative way to write this:

public class Bracketer {
    public static Bracket create(int input) {
        return new Bracket() {
            public int top() {
                return input;
            }
            public int bottom() {
                return input * -1;
            }
        };
    }
}