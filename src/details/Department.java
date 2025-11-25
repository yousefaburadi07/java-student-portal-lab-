package details;

public class Department {

    private int departmentId;
    private String departmentName;

    public Department(int departmentId, String departmentName) {
        setDepartmentName(departmentName);
        setDepartmentId(departmentId);  
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentId() {
        return this.departmentId;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void printInfo() {

        System.out.printf("Department Id: %d, Department Name: %s\n", getDepartmentId(), getDepartmentName());
    }
}
