class FactorialDoWhile{
    public static void main(String[]args)
    {
        int num=5;
        int fact=1;
        int i=1;

        do
        {
            fact=fact*i;
            i++;
        }while(i<=num);
        System.out.println("The factorial of number is "+fact);
    }
}