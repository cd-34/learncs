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
    }

    public int size() {
        return size;
    }

    private void add(int index, Object value) {
        assert index == 0 : "no support for general add yet";
        start = new Item(value, start);
        size++;
    }

    public Object get(int index) {
        assert index >= 0 && index < size;
        int currentIndex = 0;
        for (Item current = start; current != null; current = current.next) {
            if (currentIndex == index) {
                return current.value;
            }
            currentIndex++;
        }
        assert false : "Couldn't find item";
        return null;
    }

    public void set(int index, Object newValue) {
        assert index >= 0 && index < size;
        int currentIndex = 0;
        for (Item current = start; current != null; current = current.next) {
            if (currentIndex == index) {
                current.value = newValue;
            }
            currentIndex++;
        }
    }
}