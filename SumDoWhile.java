class SumDoWhile{
    public static void main(String[]args)
    {
        int num=1234;
        int sum=0;

        do
        {
            int digit=num%10;//to get last digit
            sum=sum+digit;
            num=num/10;

        }while(num!=0);
        System.out.println("Sum will be"+sum);
    }
}