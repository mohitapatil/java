package W1.Strings.SOLID;

public abstract class Person {
    private int age;
    private String Name;

    public abstract boolean isGood();

    public String getName() {
        return Name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        Name = name;
    }
}
