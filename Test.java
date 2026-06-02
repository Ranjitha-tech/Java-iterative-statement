import java.util.Scanner;

public class Test
{
    public static void main(String[]args)
    {
        System.out.println("Start");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a:");
        int a = sc.nextInt();
        System.out.println("Enter the value b:");
        int b = sc.nextInt();
        System.out.println("The sum is:"+(a+b));
        sc.close();
        System.out.println("End");

    }
}