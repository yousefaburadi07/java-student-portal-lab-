package material;

public class Course {
    private int code;
    private String name;
    private int creditHours;
    private int maxEnrollment;

    public Course(int code, String name, int creditHours, int maxEnrollment) {
        setCode(code);
        setName(name);
        setCreditHours(creditHours);
        setMaxEnrollment(maxEnrollment);    
    }
    
    public void printInfo() {
        System.out.printf("Code: %d, Name: %s, Credit Hours: %d, Max Enrollment: %d\n", getCode(), getName(), getCreditHours(), getMaxEnrollment());

    } 

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setMaxEnrollment(int maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
    }

    public String getName() {
        return this.name;
    }

    public int getCode() {
        return this.code;
    }

    public int getCreditHours() {
        return this.creditHours;
    }

    public int getMaxEnrollment() {
        return this.maxEnrollment;
    }
}
