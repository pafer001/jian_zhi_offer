package exercise;

/**
 * @author wangzhenya
 */
public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {

        int nums1[] = {1,3};
        int nums2[] = {2};

        System.out.println(new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length = nums1.length + nums2.length;

        int num3[] = new int[length];
        int k = 0;
        int i = 0, j = 0;

        while ( i < nums1.length && j < nums2.length) {
            if (nums1[i] >= nums2[j]) {
                num3[k++] = nums2[j];
                j++;
            } else {
                num3[k++] = nums1[i];
                i++;
            }
        }

        while (i < nums1.length) {
            num3[k++] = nums1[i];
            i++;
        }


        while (j < nums2.length) {
            num3[k++] = nums2[j];
            j++;
        }

        if (length % 2 == 1) {
            return num3[length / 2];
        } else {
            return (num3[length / 2] + num3[length / 2 - 1]) /2.0;
        }
    }
}
