package exercise;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        int tmp = 0;
        int x1  = x;
        while (x != 0) {
            tmp = x % 10 + tmp * 10;
            x = x / 10;
        }

        return x1 == tmp;
    }

    public static void main(String[] args) {

        System.out.println(new PalindromeNumber().isPalindrome(-2147447412));
    }
}
