public class Employee {
    void work() {
        System.out.println("Employee performs assigned work.");
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer writes Java code.");
    }
}

public class EmployeeRoleUpcasting {

    public static void main(String[] args) {

        Employee emp = new Developer(); // Upcasting

        emp.work();
    }
} {
    
}
