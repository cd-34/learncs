public class Formatter {
    public static String formatDate(long ms) {
        return Instant.ofEpochMilli(ms).toString();
    }
}