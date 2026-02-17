public class GuessingGame {
    private int secret;
    private int max;
    private int guessesused;
    private boolean solved;

    public GuessingGame(int setSecret, int setMax) {
        if (max <= 0) {
            throw new IllegalArgumentException();
        }
        secret = setSecret;
        max = setMax;
    }

    public boolean guess(int guess) {
        if (solved || guessesUsed >= max) {
            throw new IllegalArgumentException();
        }
        guessesUsed++;
        if (guess == secret) {
            solved = true;
            return true;
        }
        return false;
    }

    public int getGuess() {
        return guessesUsed;
    }
}
