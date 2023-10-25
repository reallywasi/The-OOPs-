import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        String[] studentNames=new String[10];
        int[] rollNumbers=new int[10];

        studentNames[0]="Wasi";
        rollNumbers[0]=101;

        studentNames[1]="Trump";
        rollNumbers[1]=102;

        Scanner scanner=new Scanner(System.in);

        try {
            System.out.print("Enter student index (0-9):");
            int studentIndex=scanner.nextInt();

            if (studentIndex >= 0 && studentIndex < 10) {
                System.out.println("Student Name:" + studentNames[studentIndex]);
                System.out.println("Roll Number:" + rollNumbers[studentIndex]);
            } else {
                System.out.println("Invalid student index. Please enter a number between 0 and 9.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred:" + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
