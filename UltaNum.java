class UltaNum{
    public static void main(String[]args)
    {
        int N = 10;   // Starting number

        System.out.println("Numbers from " + N + " to 1:");

        do {
            System.out.println(N);  // Print current number
            N--;                    // Decrease by 1
        } while (N >= 1);
    }
       
}