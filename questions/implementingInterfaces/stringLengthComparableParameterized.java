public class MyString implements Comparable<MyString> {
    private final String input;

    public MyString(String setInput) {
        assert setInput != null;
        input = setInput;
    }

    @Override
    public int compareTo(MyString other) {
        // if (input.length() > other.input.length()) {
        //     return 1;
        // } else if (input.length() == other.input.length()) {
        //     return 0;
        // } else {
        //     return -1;
        // }
        return input.length() - other.input.length();
    }
}