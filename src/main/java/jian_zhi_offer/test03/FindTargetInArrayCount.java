package jian_zhi_offer.test03;

/**
 * @author wangzhenya
 * 找到这样数组种元素的值有几个
 */
public class FindTargetInArrayCount {

    public static void main(String[] args) {
        int array[][] = {{1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13}};

        int count = 0;
        NodeIndex nodeIndex = FindTargetInArrayCount.findTargetInArrayCount(array, 13, array.length,
                array[0].length, array.length-1, 0);
        while (nodeIndex != null) {

            count ++;
            nodeIndex = FindTargetInArrayCount.findTargetInArrayCount(array, 2, array.length,
                    array[0].length, nodeIndex.rowIndex, nodeIndex.columnIndex + 1);
        }

        System.out.println(count);

    }

    public static NodeIndex findTargetInArrayCount(int[][] array, int target, int row, int column,
                                      int rowIndex, int columnIndex) {

        boolean find = false;
        //并且的关系
        while (rowIndex >= 0 && columnIndex < column) {
            int tmpValue = array[rowIndex][columnIndex];
            if (tmpValue == target) {
                find = true;
                break;
            } else if (tmpValue > target) {
                rowIndex--;
            } else {
                columnIndex++;
            }
        }

        if (!find) {
            return null;
        }

        NodeIndex nodeIndex = new NodeIndex();
        nodeIndex.columnIndex = columnIndex;
        nodeIndex.rowIndex =  rowIndex;

        return nodeIndex;
    }


    static class NodeIndex {
        int rowIndex;
        int columnIndex;
    }
}
