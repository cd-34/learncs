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

public class FindLinkedList extends SimpleLinkedList {
    public int find(Object input) {
        Item position = start;
        
        while (position != null) {
            if (position.value.equals(input)) {
                return true;
            }
            position = position.next;
        }
        // System.out.println(count);
        return false;
    }
}