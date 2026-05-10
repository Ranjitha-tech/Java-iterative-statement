class EvenNumSum{
    public static void main(String[]args)
    {
        int sum=0;
        for(int i=2;i<=10;i+=2)
        {
            sum += i;
            
        }
        System.out.println("Sum of even numbers from 1 to 10 "+sum);
        System.out.println("Sum of even numbers from 10 to 1 "+sum);
    }
}