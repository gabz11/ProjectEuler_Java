public class Ex3 {
    /*
     * Problem 3
     * Largest Prime Factor
     */
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(600851475143L));
    }

    static long largestPrimeFactor(long n) {
        long factor = 0;
        for (long i = 1; i < n; i++) {
            if (n % i == 0 && i > 3) {
                if (i % 2 != 0 && i % 3 != 0) {
                    if (factor == 0)
                        factor = i;
                    else if (factor * i == n)
                        return i;
                    else
                        factor *= i;
                }
            }
        }
        return factor;
    }

}
