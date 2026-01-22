public class Runner {
    private String Name;
    private String Surname;
    private int Age;
    private double Time;

    public Runner(String Name, String Surname, int Age, double Time) {
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
        this.Time = Time;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getAge() {
        return Age;
    }

    public double getTime() {
        return Time;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setTime(double Time) {
        this.Time = Time;
    }

    @Override
    public String toString() {
        return "Runner{Name="+ Name + ",Surname=" + Surname + ",Age=" + Age + ",Time=" + Time +"}";
    }
}
