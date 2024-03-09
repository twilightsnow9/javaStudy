package Algorithm.SortCode;

public class Bubble {
    public static void main(String[] args) {
//        冒泡排序
/*        核心思想：
            1.两个元素两两比较，大值在右边，小值在左边
            2.第一轮比较完毕后，最大值已经确定,第二轮可以少循环一次，后面以此类推
            3.如果数组有n个数据，我们只需要执行n-1抡代码就可以
 */
        int[] arr = {24,69,80,57,13};

        for (int i = 0; i < arr.length; i++) {
//            如果（j < arr.length）会出现索引越界
//            - i 是为了在保证前一轮不变的前提下执行下面的代码上
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
//
    }
}
