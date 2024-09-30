import java.util.ArrayList;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

public class withcustomobjectsarrlist {
    public static void main(String[] args) {
        // Create an ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Adding Student objects to the ArrayList
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 21));

        // Display the list of students
        for (Student student : students) {
            System.out.println(student);
        }

        // Find a student by name
        String searchName = "Bob";
        for (Student student : students) {
            if (student.name.equals(searchName)) {
                System.out.println("\nStudent found: " + student);
            }
        }
    }
}
