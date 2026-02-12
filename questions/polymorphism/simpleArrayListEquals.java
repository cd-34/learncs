public class SimpleArrayList {
    private final Object[] values;

    public SimpleArrayList(Object[] setValues) {
        assert setValues != null;
        values = setValues;
    }

    public boolean equals(Object o) {
        if (o == null || !(o instanceof SimpleArrayList)) {
            return false;
        }

        SimpleArrayList other = (SimpleArrayList) o;
        if (other.values.length != values.length) {
            return false;
        }
        // also need to check values
        for (int i = 0; i < values.length; i++) {
            if (!other.values[i].equals(values[i])) {
                return false;
            }
        }
        return true;
    }
}