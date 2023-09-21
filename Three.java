
// implement a program A parametrized constructor that initializes the student's name , roll number , course .A method called displayDetails that prints all the details i
public class Three {
    private String name;
    private int rollno;
    private String course;

   

    public Three(String name, int rollno, String course) {
        this.name = name;
        this.rollno = rollno;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        // Example usage of the Three class
        Three student = new Three("John", 123, "Computer Science");
        student.displayDetails();
    }
}

