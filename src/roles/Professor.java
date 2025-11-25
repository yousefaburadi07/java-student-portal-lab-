package roles;

public class Professor extends Employee {
    private int load;

    public Professor(int id, String name, int experienceYear, int salary, int load, int age) {
        super(id, name, experienceYear, salary, age);
        setLoad(load);
    }

    public void printInfo() {
        System.out.printf("Id: %d, Name: %s, Years of Exprerience: %d, Salary: %d, Load: %d, Age: %d\n", getId(),
                getName(),
                getExperienceYear(), getSalary(), getLoad(), getAge());
    }

    public int getLoad() {
        return this.load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

}
