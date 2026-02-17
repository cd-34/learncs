public class PingPonger {
    private String state;
    public PingPonger(String input) {
        if (input.equals("ping")) {
            state = "ping";
            // System.out.println("State is " + state);
        } else if (input.equals("pong")) {
            state = "pong";
            // System.out.println("State is " + state);
        } else {
            throw new IllegalArgumentException("Not the correct input");
        }
    }

    public boolean ping() {
        if (state.equals("pong")) {
            state = "ping";
            return true;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean pong() {
        if (state.equals("ping")) {
            state = "pong";
            return false;
        } else {
            throw new IllegalArgumentException();
        }
    }
}