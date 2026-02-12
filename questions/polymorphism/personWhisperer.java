public class Whisperer {
    public static String whisper(Person input) {
        if (input instanceof Student) {
            Student other = (Student) input;
            return other.hey();
        }
        if (input instanceof Staff) {
            Staff other = (Staff) input;
            return other.help();
        }
        if (input instanceof Professor) {
            Professor other = (Professor) input;
            return other.hello();
        }
        return null;
    }
}