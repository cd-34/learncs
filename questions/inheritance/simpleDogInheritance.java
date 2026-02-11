/*
public class Canine {
    private String kind;
    public Canine(String setKind) {
        kind = setKind;
    }
    public String getKind() {
        return kind;
    }
}
*/

public class Dog extends Canine {
    private double age;

    public Dog(double setAge) {
        super("dog");
        assert setAge >= 0;
        age = setAge;
    }

    public String toString() {
        return "This dog is " + age + " years old";
    }
}