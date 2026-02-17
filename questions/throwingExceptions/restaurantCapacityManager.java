public class CapacityManager {
    private int cap;
    private int current;

    public CapacityManager(int setCap) {
        cap = setCap;
    }

    public int enter(int in) {
        if (in <= 0) {
            throw new IllegalArgumentException();
        }
        if (in > 8) {
            throw new PartyTooLarge()
            // this is supposed to be a checked exception
            // maybe needed to try-catch?
            // didn't know how to "fix" this error:
            // CapacityManager.java:15: error: unreported exception PartyTooLarge; must be caught or declared to be thrown
            // couldn't solve it without making a new exception class by Extends Exceptions
            // as the website won't let you make any more classes
        }
        if ((in + current) > cap) {
            throw new IllegalStateException();
        }
        current += in;
        return current;
    }

    public int leave(int out) {
        if (out <= 0) {
            throw new IllegalArgumentException();
        }
        if (out > 8 || (current - 0) < 0) {
            throw new IllegalStateException();
        }
        current -= out;
        return current;
    }
}