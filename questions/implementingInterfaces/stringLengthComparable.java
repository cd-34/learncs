public class MyString implements Comparable {
    private String input;

    public MyString(String setInput) {
        assert setInput != null;
        input = setInput;
    }

    @Override
    public int compareTo(Object other) {
        MyString o = (MyString) other;
        return input.length() - o.input.length();
    }
}