public class SimpleLinkedList {
    private class Item {
        private Object value;
        private Item next;

        Item(Object setValue, Item setNext) {
            value = setValue;
            next = setNext;
        }
    }

    private Item start;
    private int size;

    public SimpleLinkedList(Object[] values) {
        assert values != null;
        for (int i = values.length - 1; i >= 0; i--) {
            add(0, values[i]);
        }
        size = values.length;
    }

    public int size() {
        return size;
    }

    private Item walkTo(int index) {
        assert index >= 0 && index < size;
        int currentIndex = 0;
        for (Item current = start; current != null; current = current.next) {
            if (currentIndex == index) {
                return current;
            }
            currentIndex++;
        }
        assert false;
        return null;
    }

    public Object get(int index) {
        return walkTo(index).value;
    }

    public void set(int index, Object newValue) {
        walkTo(index).value = newValue;
    }

    public void add(int index, Object value) {
        assert index >= 0 && index <= size;
        Item newItem = new Item(value, null);
        if (index == 0) {
            newItem.next = start;
            start = newItem;
        } else {
            int currentIndex = 0;
            Item current = start;
            while (currentIndex < index - 1) {
                current = current.next;
                currentIndex++;
            }
            newItem.next = current.next;
            current.next = newItem;
        }
        size++;
    }
}