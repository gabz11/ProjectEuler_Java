public class Ex1 {
    /*
     * Problem 1
     * Multiples of 3 and 5
     */
    public static void main(String[] args) {
        System.out.println(multiplesOf3Or5(10));
    }

    static int multiplesOf3Or5(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        return sum;
    }
}