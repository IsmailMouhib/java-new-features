package ma.java16.records;

// preview 14 & 15
public class Records {

    record Person(String name, String cin, int age) {
        public Person(String name, String cin) {
            this(name, cin, 0);
        }

        @Override
        public String toString() {
            return "test";
        }
    }

    public static void main(String[] args) {
        Person person = new Person("ismail", "CD5989", 34);
        Person person1 = new Person("ismail", "CD5989");

        System.out.println(person1.toString());
        // Record properties are immutable ==> can't do set

    }
}
