public class Ex5 {
    /*
     * Problem 5
     * Smallest Multiple
     */
    public static void main(String[] args) {
        System.out.println(smallestMultiple());
    }

    static int smallestMultiple() {
        for (int i = 1; i < 1000000000; i++)
            if (isDivisible(i))
                return i;
        return -1;
    }

    static boolean isDivisible(int n) {
        for (int i = 1; i <= 20; i++) {
            if (n % i != 0)
                return false;
        }
        return true;
    }
    // OBS: Tentar menor divisivel pelo produto do multiplo para n usar um alcance
    // alto?
}
