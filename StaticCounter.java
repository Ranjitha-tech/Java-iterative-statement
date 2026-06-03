class Student {
    static int count = 0;

    Student() {
        count++;
    }

    static void displayCount() {
        System.out.println("Total Students: " + count);
    }
}

public class StaticCounter {
    public static void main(String[] args) {
        new Student();
        new Student();
        new Student();

        Student.displayCount();
    }
}