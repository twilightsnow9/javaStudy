package Algorithm.Search;

public class BinarySearch {
    public static void main(String[] args) {
//        二分查找
//        前提：数据必须提前有序
//        核心：每次去掉一半的值
        int[] arr = {7,23,79,81,103,127,131,147};
        System.out.println(binarySearch(arr, 81));
    }

    public static int binarySearch(int[] arr, int num) {
//        定义两个变量记录要查找的范围
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;
        while (true) {
//            确定该数字在数组的范围中
            if (num > arr[max] || num < arr[min]) {
                return -1;
            }
            mid = (max + min) / 2;
            if (arr[mid] < num) {
//                num在mid的右边
                min = mid + 1;
            } else if (num < arr[mid]) {
//                num在mid的左边
                max = mid - 1;
            } else {
                return mid;
            }
        }
    }
}
