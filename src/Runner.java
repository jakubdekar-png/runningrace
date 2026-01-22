public class Runner {
    private String name;
    private String surname;
    private int age;
    private double time;

    public Runner(String name, String surname, int age, double time) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Runner{name='" + name + "', surname='" + surname + "', age=" + age + ", time=" + time + "}";
    }
}
