package lqb;

import java.util.Scanner;

public class DayMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int m = (8 * 8) - (8 * 4) / 2 - (8 * 2) / 2 - (6 * 4) / 2;
//        System.out.println(m);

//        for (int a = 0; a < 100; a++) {
//            for (int b = 0; b < 100; b++) {
//                if ((a + b) * 6 == a * b && a != b) {
//                    if (a - b <= 8 && a - b >=0) {
//                        System.out.println(a);
//                        System.out.println(b);
//                    }
//                    if (b - a <= 8 && b - a >=0) {
//                        System.out.println(a);
//                        System.out.println(b);
//                    }
//                }
//
//            }
//        }
        double a = (6.4 - 2.3) * (7.2 - 2.5) -
                (((6.4 - 5.1) * (7.2 - 3.1)) / 2) -
                (((7.2 - 2.5) * (5.1 - 2.3)) / 2) -
                (((6.4 - 2.3) * (3.1 - 2.5)) / 2);
        System.out.println(a);
    }
}
