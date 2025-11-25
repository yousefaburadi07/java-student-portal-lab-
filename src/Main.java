import details.Department;
import material.Course;
import roles.Manager;
import roles.Professor;
import roles.Staff;
import roles.Student;

public class Main {

    public static void main(String[] args) {
        Manager manager1 = new Manager(12, "Moh", 5, 800, 35);
        Student student1 = new Student(01, "yousef", "CS", 07456545, 4, 18);
        Staff staff1 = new Staff(12, "someti", 2, 250, 20, "idk");
        Professor professor1 = new Professor(23, "Ahmad", 7, 1000, 234, 40);
        Department department1 = new Department(01, "IT");
        Course course1 = new Course(235, "Java", 3, 233);
        manager1.printInfo();
        student1.printInfo();
        staff1.printInfo();
        professor1.printInfo();
        department1.printInfo();
        course1.printInfo();

        System.out.println(manager1.calcAnnualSalary());
        System.out.println(staff1.calcAnnualSalary());
    }

}
