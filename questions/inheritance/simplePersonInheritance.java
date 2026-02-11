public class Student extends Person {
    private int id;
    public Student(String name, int getID) {
        super(name);
        assert getID >= 0;
        id = getID;
    }

    public int getID() {
        return id;
    }
}