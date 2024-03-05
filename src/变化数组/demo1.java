package 变化数组;

import java.sql.Array;

public class demo1 {
    public static void main(String[] args) {
//        定义数组，如果是奇数，将当前数字扩大2倍。如果是偶数缩小为原来的二分之一,
//        将对应的数字填入对应数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr1 = new int[5];
        int a = 0;
        int b = 0;
        int[] arr2 = new int[5];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
                arr1[a] = arr[i];
//                System.out.println(arr1[a]);
                a++;
            } else {
                arr[i] = arr[i] * 2;
                arr2[b] = arr[i];
//                System.out.println(arr2[b]);
                b++;
            }
        }
        System.out.println();

        for (int i : arr1) {
            System.out.println(i);
        }
        System.out.println();
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
