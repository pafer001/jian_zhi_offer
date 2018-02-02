package jian_zhi_offer.test03;

/**
 * 题目描述
 *
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 输入描述
 *
 *  array： 待查找的二维数组 target：查找的数字
 *  输出描述
 *
 * 查找到返回true，查找不到返回false
 *
 * @author puffer
 */
public class FindInArray {

    public static void main(String[] args) {

        int array[][] = {{1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13}};

        System.out.println(FindInArray.findInArray(array, 5));


    }


    public static boolean findInArray(int[][] array, int target) {
        //行
        int row = array.length;
        //高
        int column = array[0].length;

        int i = row -1;
        int j = 0;
        //并且的关系
        while (i >= 0 && j < column) {
            int tmpValue = array[i][j];
            if (tmpValue == target) {
                return true;
            } else if (tmpValue > target) {
                i--;
            } else {
                j++;
            }
        }

        return false;

    }





}
