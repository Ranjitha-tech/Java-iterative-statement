class MethodOverloading{
    void display()
    {
        System.out.println("hello Sir");
    }
    void display(int x)
    {
        System.out.println(x);
    }
    void display(int x, String y)
    {
        System.out.println(x+" "+y);
    }
    void display(String x, String y)
    {
        System.out.println(x+" "+y);
    }
}


public class Runner{
     public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        obj.display();
        obj.display(10);
        obj.display(10,"Manu");
        obj.display("Manu","Chinnu");
    }

}