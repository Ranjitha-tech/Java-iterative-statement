class AreaCalculator
{
    void area(int side)
    {
        System.out.println("Area of Square = " + (side * side));
    }

    void area(int length, int breadth)
    {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    void area(double radius)
    {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }

    public static void main(String[] args)
    {
        AreaCalculator obj = new AreaCalculator();

        obj.area(5);         // Square
        obj.area(10, 4);     // Rectangle
        obj.area(3.5);       // Circle
    }
}