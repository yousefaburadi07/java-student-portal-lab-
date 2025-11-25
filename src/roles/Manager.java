package roles;

public class Manager extends Employee {

    public Manager(int id, String name, int experienceYear, int salary, int age) {
        super(id, name, experienceYear, salary, age);
    }

    public void printInfo() {
        System.out.printf("Id: %d, Name: %s, Years of Exprerience: %d, Salary: %d,Age: %d\n", getId(),
                getName(),
                getExperienceYear(), getSalary(), getAge());

    }

    public double calcAnnualSalary() {

        return getSalary() * 12;
    }

}
