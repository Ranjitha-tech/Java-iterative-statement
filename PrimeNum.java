class PrimeNum{
    public static void main(String[]args)
    {
        int start = 10;   // starting number
        int end = 50;     // ending number
        int sum = 0;
        int i = start;

        while (i <= end) {
            int j = 2;
            boolean prime = true;

            while (j <= i / 2) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
                j++;
            }

            if (prime && i > 1) {
                sum += i;   // add prime number
            }
            i++;
        }

        System.out.println("Sum of primes between " + start + " and " + end + " = " + sum);
    }
}


