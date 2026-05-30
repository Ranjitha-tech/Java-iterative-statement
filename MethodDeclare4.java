
public class MethodDeclare4{
    int findSquare(int n)
    {
        return n*n;
    }
    public static void main(String[]args)
    {
        MethodDeclare4 obj=new MethodDeclare4();
        System.out.println(obj.findSquare(5));
        int result=obj.findSquare(6);
        System.out.println(result);
    }
}