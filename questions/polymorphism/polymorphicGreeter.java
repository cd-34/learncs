public class Greeter {
    public static String greet(Person input) {
        if (input instanceof Professor) {
            return "Hi Professor " + input.getName();
        }
        if (input instanceof Student) {
            return "Hey " + input.getName() + ", you are not alone!";
        }
        if (input instanceof Staff) {
            Staff staffinstance = (Staff) input;
            return "Thanks " + input.getName() + " for all your help with " + staff.getRole();
        }
        return null;
    }
}