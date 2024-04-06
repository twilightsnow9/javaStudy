package lqb;

public class math {
    public static void main(String[] args) {
//        int[] arr = {99, 22, 51, 63, 72, 61, 20, 88, 40, 21, 63,
//                    30, 11, 18, 99, 12, 93, 16, 7, 53, 64,
//                    9, 28, 84, 34, 96, 52, 82, 51, 77 };
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] * arr[j] >= 2022) {
//                    sum++;
//                }
//
//            }
//        }
//        System.out.println(sum);
        for (int i = 2022; i < 10000; i++) {
            String b = Integer.toBinaryString(i);
            int m = 0;
            for (int j = 6; j > 0; j--) {
//                System.out.println(b.charAt(b.length() - j));
                if (b.charAt(b.length()  - j) == '0') {
                    m++;
                }
            }
            if (m == 6) {
                System.out.println(i);
                break;
            }
        }
    }
}
