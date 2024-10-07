package studentexample;

/**
 * This class represents a Student
 *
 * @author Paul Bonenfant 2024
 */
public class Student {
    
    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}
