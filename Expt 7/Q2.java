import java.util.Scanner;

public class DivideByZeroSimple
{
    public static void main(String[] args)
  {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend=scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor=scanner.nextInt();

        if (divisor != 0){
            int result=dividend/divisor;
            System.out.println("Result of the division" + result);
        }
        else
        {
            System.out.println("Error: Division by zero is not allowed");
        }

        scanner.close();
    }
}
