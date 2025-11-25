package roles;

public class Student extends Person {

    private String major;
    private int phoneNumber;
    private int secondaryGPA;

    public Student(int id, String name, String major, int phoneNumber, int secondaryGPA, int age) {
        super(id, name, age);
        setMajor(major);
        setPhoneNumber(phoneNumber);
        setSecondaryGPA(secondaryGPA);
    }

    public String getMajor() {
        return this.major;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getSecondaryGPA() {
        return this.secondaryGPA;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSecondaryGPA(int secondaryGPA) {
        this.secondaryGPA = secondaryGPA;
    }

    public void printInfo() {
        System.out.printf("Id: %d, Name: %s, Major: %s, Phone Number: %d,Age: %d Secondary GPA: %d\n", getId(),
                getName(),
                getMajor(), getPhoneNumber(), getAge(), getSecondaryGPA());
    }
}
