public class TestArrayMax {
    public static void test(ArrayMax input) {
        // testing edge cases
        assert input.max(new int[] {1}) == 1;
        assert input.max(new int[] {99, 1, 3, 4}) == 99;
        assert input.max(new int[] {99, 1, 3, 4, 100}) == 100;
        assert input.max(new int[] {-99, 1, 3, 4}) == 4;
        assert input.max(new int[] {-99, -1, -3, -4}) == -1;

        // try-catch for null
        try {
            input.max(null);
            assert false; // should not be reached and should go to IllegalArgumentException
        } catch (IllegalArgumentException e) {
            //throws IllegalArgumentException
        } catch (Exception e) {
            // for any other exceptions, assert false
            assert false;
        }

        // try-catch for empty array
        try {
            input.max(new int[] {}); 
            assert false;
        } catch (IllegalArgumentException e) {

        } catch (Exception e) {
            assert false;
        }
    }
}