public class RunningTotal implements IRunningTotal {
    private int total;
    
    public int currentTotal() {
        return total;
    }

    public void add(int value) {
        total += value;
    }

    public void subtract(int value) {
        total -= value;
    }
}