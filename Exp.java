public class Exp{
    public void static void(String[]args)
    {
        int i=1;
        do{
            if(i==5)
            {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}