public class Ex4 {
    /*
     * Problem 4
     * Largest Palindrome Number
     */
    public static void main(String[] args) {
        System.out.println(largestPalindrome());
    }

    static int largestPalindrome() {
        int largest = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                if ((isPalindrome(i * j)) && i * j > largest)
                    largest = i * j;
            }
        }
        return largest;
    }

    static boolean isPalindrome(int n) {
        String p_int = Integer.toString(n);
        char[] str_arr = p_int.toCharArray();
        int index = p_int.length() - 1;
        for (int i = 0; i < str_arr.length; i++) {
            if (str_arr[i] != str_arr[index])
                return false;
            index--;
        }
        return true;
    }
}