/*
public class Feliform {
    private String type;

    public Feliform(String setType) {
        type = setType;
    }

    public String getType() {
        return type;
    }
}
*/

public class Cat extends Feliform {
    private String name;

    public Cat(String setName) {
        super("cat");
        assert setName != null;
        name = setName;
    }

    public String toString() {
        return name + " is the best cat";
    }
}

/* 
Feliform test = new Feliform("type");
System.out.println(test);
Cat test2 = new Cat("kyaru");
System.out.println(test2.toString());

returns the following:
Feliform@3533f013
kyaru is the best cat
*/