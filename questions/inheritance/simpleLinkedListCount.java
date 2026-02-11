/*
protected class Item {
    public Object value;
    public Item next;
    Item(Object setValue, Item setNext) {
        value = setValue;
        next = setNext;
    }
}
*/

public class CountLinkedList extends SimpleLinkedList {
    public int count(Object input) {
        int count = 0;
        Item position = start;
        
        while (position != null) {
            if (position.value.equals(input)) {
                count++;
            }
            position = position.next;
        }
        // System.out.println(count);
        return count;
    }
}