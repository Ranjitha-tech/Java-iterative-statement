class Staff {
    void duty() {
        System.out.println("Staff performs hospital duties.");
    }
}

class Nurse extends Staff {
    void assistDoctor() {
        System.out.println("Nurse assists the doctor.");
    }
}

public class HospitalStaffUpcasting {

    public static void main(String[] args) {

        Staff staff = new Nurse(); // Upcasting

        staff.duty();
    }
}
