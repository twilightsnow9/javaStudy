package Algorithm.Arrays;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {2,1,44,22,45,12,66};

        System.out.println(TwoSearch(arr,2));
    }

    public static int TwoSearch(int[] arr, int target) {
        Arrays.sort(arr);
        int i = Arrays.binarySearch(arr, target);
        if (i >= 0) {
            return i;
        }
        return -1;
//        return -1;
    }

}

