public class Ex2 {
    /*
     * Problem 2
     * Even Fibonacci Numbers
     */
    public static void main(String[] args) {
        System.out.println(evenFibonacci());
    }

    static int evenFibonacci() {
        int a1 = 0;
        int a2 = 1;
        int an = 0;
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (an > 4000000)
                break;
            an = a1 + a2;
            a1 = a2;
            a2 = an;
            if (an % 2 == 0)
                sum += an;
        }
        return sum;
    }
}
