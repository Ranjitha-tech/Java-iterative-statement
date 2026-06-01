import java.util.Scanner;

public class EmployeeScan {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the employee age");
        int age=sc.nextInt();
        System.out.println("enter the employee name");
        String name=sc.next();
        System.out.println("enter the employee sal");
        double sal=sc.nextDouble();
        System.out.println("enter the employee details" +age+ name +sal);

    }

}
