public class Person {
    private int age;
    private String name;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
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
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAgeAndName(int age, String name) {
        this.age = age;
        this.name = name;
    }
}