package roles;

public class Person {

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        setId(id);
        setName(name);
        setAge(age);

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("id should be bigger than 0");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 17) {

            this.age = age;
        } else {

            System.out.println("age should be 18 or higher");
        }
    }

}
