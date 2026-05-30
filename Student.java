public class Student{
    String name;
    int marks;
    public static void main(String[]args)
    {
        Student s1=new Student();
        Student s2=new Student();

        s1.name="ranjitha";
        s1.marks=98;

        s2.name="Manukumar";
        s2.marks=90;
        
        System.out.println(s1.name+" "+s1.marks);
        System.out.println(s2.name+" "+s2.marks);
    }
}