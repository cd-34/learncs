public class CountLinkedList extends SimpleLinkedList {
    public int countEqual(Object input) {
        int count = 0;
        Item position = start;

        if (input == null) {
            throw new IllegalArgumentException();
        }

        while (position != null) {
            if (position.value.equals(input)) {
                count++;
            }
            position = position.next;
        }
        return count;
    }
}