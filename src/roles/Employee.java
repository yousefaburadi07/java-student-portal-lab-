package roles;

public class Employee extends Person {

    private int experienceYear;
    private int salary;
    private int load;

    public Employee(int id ,String name, int experienceYear, int salary, int age) {
        super(id, name, age);
        setExperienceYear(experienceYear);
        setSalary(salary);
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        if (experienceYear > -1) {
            this.experienceYear = experienceYear;
        } else {
            System.out.println("year should be bigger or equal to 0");

        }
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("salary should be bigger than 0");
        }
    }

    public int getLoad() {
        return this.load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

}
