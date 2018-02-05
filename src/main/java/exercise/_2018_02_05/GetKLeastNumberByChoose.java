package exercise._2018_02_05;

/**
 * choose
 */
public class GetKLeastNumberByChoose {

    public static int[] getKLeastNumber(int[] array, int k) {

        if (array == null && k >= array.length) {
            return array;
        }
        int[] kLeastArray = new int[k];
        for (int i= 0; i< array.length; i++) {

            if (i < k) {
                kLeastArray[i] = array[i];
                continue;
            }

            checkAndInsert(kLeastArray, array[i]);
        }

        return kLeastArray;
    }

    public static int[] checkAndInsert(int[] kLeastArray, int e) {

        int maxValue, maxIndex;
        maxValue = kLeastArray[0];
        maxIndex = 0;
        for (int i =0; i< kLeastArray.length; i++) {
           if (maxValue < kLeastArray[i]) {
               maxValue = kLeastArray[i];
               maxIndex = i;
           }
        }

        if (maxValue > e) {
            kLeastArray[maxIndex] = e;
        }
        return kLeastArray;
    }

    public static void main(String[] args) {

        int arr[] = { 4, 5, 1, 6, 2, 7, 3, 8 };
        int[] kLeastNumber = getKLeastNumber(arr, 4);

        for (int e : kLeastNumber) {
            System.out.println(e);
        }
    }
}
