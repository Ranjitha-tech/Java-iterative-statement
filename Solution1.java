class Employee{
  int id;
  String name;
  double sal;
}
class Solution1{
    public static void main(String[]args)
    {
        Employee e1 =new Employee();
        Employee e2 =new Employee();
        Employee e3 =new Employee();

        System.out.println("Empid name sal");
        System.out.println(e1.id+" "+e1.name+" "+e1.sal);
        System.out.println(e2.id+" "+e2.name+" "+e2.sal);
        System.out.println(e3.id+" "+e3.name+" "+e3.sal);
        System.out.println("====================");

        e1.id=101;
        e1.name="alex";
        e1.sal=10000.00;
        
        e2.id=102;
        e2.name="bob";
        e2.sal=20000.00;

        e3.id=103;
        e3.name="alice";
        e3.sal=30000.00;

        System.out.println("Empid name sal");
        System.out.println(e1.id+" "+e1.name+" "+e1.sal);
        System.out.println(e2.id+" "+e2.name+" "+e2.sal);
        System.out.println(e3.id+" "+e3.name+" "+e3.sal);

        System.out.println("======================");

        System.out.println("id:"+e1.id+"\n"+"name:"+e1.name+"\n"+"sal:"+e1.sal);

    }
}