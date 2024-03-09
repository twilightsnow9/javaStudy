package Algorithm.SortCode;

public class Insert {
    public static void main(String[] args) {
//        插入排序
        /*
            核心：将0-N之间的数字看作是有序的，剩下的看做无序的,
            遍历无序的数字，将遍历到的元素插入到有序的数组里,相同的元素放到后边
            然后将该数字跟有序数组的每一项从右往左比
            N的范围 0~最大索引
         */
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
//        1.找到无序数组的起点
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }
//        2.开始遍历无序部分
        for (int i = startIndex; i < arr.length; i++) {
//            将遍历到的无序部分与从右与有序部分比较
//            int j = i;
//            while (j > 0 && arr[j] < arr[j - 1]) {
//                int temp = arr[j];
//                arr[j] = arr[j - 1];
//                arr[j - 1] = temp;
//                j--;
//            }

            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
