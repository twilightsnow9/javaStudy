package Algorithm.SortCode;

public class Selection {
    public static void main(String[] args) {
//        选择排序
        /*核心：从0索引开始，跟后面的元素意义比较
         */

        int[] arr = {24,69,80,57,13,35};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
