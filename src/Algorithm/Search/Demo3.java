package Algorithm.Search;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums1 = {1,3};
        int[] nums2 = {2};
//        for (int i = 0; i < nums1.length; i++) {
//            nums1[i] = sc.nextInt();
//        }
//        for (int i = 0; i < nums2.length; i++) {
//            nums2[i] = sc.nextInt();
//        }

        System.out.println(search(nums1,nums2));
    }

    public static double search(int[] nums1,int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }
        int j = 0;
        for (int i = nums1.length; i < nums1.length + nums2.length; i++) {
//            int j = 0;
            arr[i] = nums2[j];
            j++;
        }
//新数组排序
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < i; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }

//        查找中间值
        if (arr.length % 2 == 0) {
            int m = (arr.length) / 2;
            double a = (double)(arr[m] + (double)arr[m - 1]) / 2;
            return a;
        } else {
            int m = (arr[0] + arr[arr.length - 1]) / 2;
            System.out.println(m);
            return m;
        }
    }
}
