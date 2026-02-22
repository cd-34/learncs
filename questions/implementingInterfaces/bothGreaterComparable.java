// return 1 if one > input.one && two > input.two
// return -1 if one < input.one && two < input.two
// else return 0
public class BothGreater implements Comparable<BothGreater> {
    private int one;
    private int two;
    public BothGreater(int setOne, int setTwo) {
        one = setOne;
        two = setTwo;
    }

    public int compareTo(BothGreater input) {
        // System.out.println("one & two: " + one + " " + two);
        // System.out.println("input.one & inputtwo: " + input.one + " " + input.two);
        if (one > input.one && two > input.two) {
            return 1;
        } else if (one < input.one && two < input.two) {
            return -1;
        } else {
            return 0;
        }
    }
}