public class Action {
    public static void main(String[] args) {
        Person alice = new Person(16, "Alice");
        alice.printAge();
        alice.birthday();
        alice.printAge();
        alice.setAge(42);
        alice.getAge();
        alice.setAgeAndName(0, null);
    }
}
