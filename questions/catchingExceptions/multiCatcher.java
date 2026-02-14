public class Catcher {
    public static int retrieveValue(Faulter input) {
        while (true) { // very dangerous!
            try {
                return input.getValue();
            } catch (Exception e) {

            }
        }
    }
}

/*
Generally, the code `while (true)` is very dangerous because it can loop infinitely if you miss a condition
Something a bit safer would be to create a for loop for 99 loops
And just `throw new IllegalStateException("Failed to retrieve value")` if you don't get it in time
Check solution on https://www.learncs.online/lessons/java/catchingexceptions#multi-catcher for more details
*/