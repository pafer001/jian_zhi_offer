package exercise._2018_02_05;

public class GetKLeastNumberByInsert {

    public static int[] getKLeastNumber(int[] array, int k) {

        if (array == null && k >= array.length) {
            return array;
        }

        int[] kLeastArray = new int[k];
        for (int i = 0; i < array.length; i++) {
            insertAndSort(kLeastArray, i, array[i]);
        }

        return kLeastArray;
    }

    /**
     * 从小到大排序
     *
     * @param kLeastArray
     * @param index
     * @param e
     * @return
     */
    public static int[] insertAndSort(int[] kLeastArray, int index, int e) {

        if (kLeastArray.length - 1 < index) {

            if (kLeastArray[kLeastArray.length - 1] <= e) {
                return kLeastArray;
            }
            int i = 0;
            for (i = kLeastArray.length - 2; i >= 0; i--) {
                if (kLeastArray[i]> e) {
                    kLeastArray[i +1] = kLeastArray[i];
                } else {
                    kLeastArray[i +1] = e;
                    return kLeastArray;
                }
            }

            if (i == -1) {
                kLeastArray[i+1] = e;
            }
        } else {

            if (index == 0) {
                kLeastArray[index] = e;
                return kLeastArray;
            }

            int i = 0;
            for (i = index-1; i >= 0; i--) {
                if (kLeastArray[i]> e) {
                    kLeastArray[i +1] = kLeastArray[i];
                } else {
                    kLeastArray[i +1] = e;
                    return kLeastArray;
                }
            }
            if (i == 0) {
                kLeastArray[i] = e;
            }
        }

        return kLeastArray;
    }


    public static void main(String[] args) {

        int arr[] = {4, 5, 1, 6, 2, 7, 3, 8};
        int[] kLeastNumber = getKLeastNumber(arr, 2);

        for (int e : kLeastNumber) {
            System.out.println(e);
        }
    }
}
