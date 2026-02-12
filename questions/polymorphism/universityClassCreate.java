public class University {
    private final String name;
    private final int founding;

    public University(String setName, int setFounding) {
        // can I just set final fields like this?
        name = setName;
        founding = setFounding;
    }

    public String getName() {
        return name;
    }

    public int getFoundingYear() {
        return founding;
    }

    @Override 
    public boolean equals(Object o) {
        if (o == null || !(o instanceof University)) {
            return false;
        }
        University other = (University) o;
        return other.name.equals(name) && other.founding == founding;
    }

    @Override
    public String toString() {
        return name + " (est. " + founding + ")";
    }
}