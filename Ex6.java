public class Ex6 {
    /*
     * Problem 6
     * Sum Square Diference
     */
    public static void main(String[] args) {
        System.out.println(squareOfSum() - sumOfSquares());
    }

    static int sumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 100; i++)
            sum += i * i;
        return sum;
    }

    static int squareOfSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum * sum;
    }
}
