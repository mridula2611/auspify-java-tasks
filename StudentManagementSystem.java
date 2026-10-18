class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Anu", 85.5);
        Student s2 = new Student(102,"Priya",90);
        Student s3 = new Student(103,"Karthika",89);
        s1.display();
        s2.display();
        s3.display();
    }
}
