public class MethodDeclare3{
    int display()
    {
        return 10;
    }
    public static void main(String[] args)
    {
         MethodDeclare3 obj = new MethodDeclare3();
        //bad practice
        System.out.println(obj.display());
        //good-practice
        int x=obj.display();
        System.out.println(x);
    }
}