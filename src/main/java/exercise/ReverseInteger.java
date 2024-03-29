package exercise;

public class ReverseInteger {

    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }

        return result;
    }


    public static void main(String[] args) {

        ReverseInteger reverseInteger = new ReverseInteger();
//        System.out.println(reverseInteger.reverse(123));
//        System.out.println(reverseInteger.reverse(-123));
        System.out.println(reverseInteger.reverse(1534236469));
//        2147483647
//        1534236469
    }
}
