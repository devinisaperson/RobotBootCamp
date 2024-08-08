public class Person {
    private int age;
    public Person(int age) {
        this.age = age;
    }
    public void printAge() {
        System.out.println(age);
    }
    public void birthday() {
        age++;
    }
    public void timeTravel(int years) {
        age += years;
    }
}