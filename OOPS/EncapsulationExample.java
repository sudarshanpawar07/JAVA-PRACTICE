class Student {
    // private fields (data hidden from outside)
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age (with condition)
    public void setAge(int age) {
        if (age > 0) {   // only allow positive age
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s1 = new Student();

        // setting values using setters
        s1.setName("Sudarshan");
        s1.setAge(22);

        // getting values using getters
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

        // trying to set invalid value
        s1.setAge(-5);
    }
}
