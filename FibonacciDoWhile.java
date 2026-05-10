class FibonacciDoWhile{
    public static void main(String[]args)
    {
        int num=10;//num to be displayed
        int a=0,b=1;//first two numbers
        int i=1;

        System.out.println("Fibonacci series");
        do
        {
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;
            i++;
        }while(i<=num);
    }
}