package Level1;

public class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }

    public Person(Person other) {
        if (other == null) {
            throw new IllegalArgumentException("Cannot copy null Person");
        }
        this.name = other.name;
    }

    public static void main(String[] args) {
        Person person = new Person("John");

        Person person2 = new  Person(person);

        System.out.println(person.name + " " + person2.name);

    }
}
