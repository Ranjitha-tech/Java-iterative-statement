class ArithmeticMixer {

    void calculate(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void calculate(double a, double b) {
        System.out.println("Product: " + (a * b));
    }

    public static void main(String[] args) {
        ArithmeticMixer obj = new ArithmeticMixer();

        obj.calculate(10, 20);
        obj.calculate(4.5, 3.2);
    }
}
