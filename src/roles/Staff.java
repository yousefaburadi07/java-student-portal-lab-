package roles;

public class Staff extends Employee {

    private String section;

    public Staff(int id, String name, int experienceYear, int salary, int age, String section) {
        super(id, name, experienceYear, salary, age);
        setSection(section);
    }

    public String getSection() {
        return this.section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void printInfo() {
        System.out.printf("Id: %d, Name: %s, Years of Exprerience: %d, Salary: %d,Age: %d Section: %s\n", getId(),
                getName(),
                getExperienceYear(), getSalary(), getAge(), getSection());
    }

    public double calcAnnualSalary() {

        return getSalary() * 12;
    }

}
