public class MethodDeclare2{
    void add(int a, int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        MethodDeclare2 obj = new MethodDeclare2();
        obj.add(10,20);
        obj.add(40, 50);
        obj.add(70, 80);
    }
}