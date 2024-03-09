package java基础.StringDeem;

import java.util.Queue;

public class StringDemo7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        char[] arr1 = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = (char) arr[i];
        }
        String str = new String(arr1);
        System.out.println(str);
    }

//    public static String arrToString(int[] arr) {
//        if (arr.length == 0) {
//            return "[ ]";
//        } else {
//            String m = "[";
//            String Q;
//            for (int i = 0; i < arr.length; i++) {
//                Q = arr[i];
//            }
//            return m + Q + "],";
//        }
//
//    }
}
