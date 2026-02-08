public class TestArraySum {
    public static void test(Arraysum input) {
        assert input.sum(null) == 0;
        assert input.sum(new int[] {}) == 0;
        assert input.sum(new int[] {1, 2}) == 3;
        assert input.sum(new int[] {3}) == 3;
    }
}