package exercise._2018_02_05;

/**
 * @author wangzhenya
 */
public class FindGreatestSumOfSubArray {

    public static int findGreatestSumOfSubArray(int arrays[]) {

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int tmpData : arrays) {
            sum += tmpData;
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
            //  保存数据中的最大值
            //  这种情况下是为了排除整个数组全为负数的特殊情况
            if (tmpData > maxSum) {
                maxSum = tmpData;
            }

        }
        return maxSum;
    }


    public static void main(String[] args) {
        int arr1[] = { 6, -3, -2, 7, -15, 1, 2, 2};
        System.out.println(findGreatestSumOfSubArray(arr1));
    }
}
