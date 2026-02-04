public class ScoreTracker {
    private int score1 = 0;
    private int score2 = 0;
    private boolean p1turn = true;
    
    public void score(int input) {
        if (p1turn) {
        score1 += input;
        } else {
        score2 += input;
        }
        p1turn = p1turn;
    }
    
    public int currentlyAhead() {
        if (score1 > score2) {
        return 1;
        } else if (score1 < score2) {
        return 2; 
        } else {
        return 0;
        }
    }
    
}

// ScoreTracker test = new ScoreTracker();
// test.score(2);
// System.out.println(test.currentlyAhead());