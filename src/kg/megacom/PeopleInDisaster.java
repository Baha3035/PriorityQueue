package kg.megacom;

public class PeopleInDisaster {
    private int age;
    private String health;
    private String name;

    public PeopleInDisaster(int age, String health, String name) {
        this.age = age;
        this.health = health;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PeopleInDisaster() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "PeopleInDisaster{" +
                "age=" + age +
                ", health='" + health + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
