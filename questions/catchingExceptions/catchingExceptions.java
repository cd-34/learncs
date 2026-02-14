public class Catcher {
    public static int catcher(Faulter input) {
        try {
            input.fault();
        } catch (NullPointerException e) {
            return 1;
        } catch (IllegalArgumentException e) {
            return 2;
        } catch  (IllegalStateException e) {
            return 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 4;
        }
        return 0;
    }
}