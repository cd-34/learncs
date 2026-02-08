public class Person {
    private String name;

    public Person(String setName) {
        assert setName != null;
        name = setName;
    }

    public static String encourage(Person person) {
        return person.name + ", you are not alone!";
    }
}