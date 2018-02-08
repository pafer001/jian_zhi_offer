package exercise._2018_02_05;

public class QuickSort {

    public static void main(String[] args) {
        int array[] = {3,6,1,8,9,4,7};
        quick(0, array.length -1, array);

        for (int a : array) {
            System.out.println(a);
        }
    }

    public static int[] quick(int left, int right, int array[]) {

        if (right <= left) {
            return array;
        }

        int min = findMin(left, right, array);

        quick(left, min-1, array);
        quick(min + 1, right, array);

        return array;
    }

    static int findMin(int left, int right, int array[]) {

        int base = array[left];
        while (left != right) {
            //从右边找到第一个比base下标小的
            while (right > left && array[right] > base ) {
                right --;
            }
            if (right != left) {
                array[left] = array[right];
            }

            //从右边找到第一个比base下标小的
            while (right > left && array[left] < base ) {
                left ++;
            }
            if (right != left) {
                array[right] = array[left];
            }

        }

        array[left] = base;
        return left;
    }





}
