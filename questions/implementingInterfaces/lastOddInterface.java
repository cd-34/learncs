public class LastOdd implements ILastOdd{
    private int value;

    public boolean lastOdd() {
        return value % 2 != 0;
    }

    public void add(int setValue) {
        value = setValue;
    }
}