package lqb;

import java.util.Scanner;

public class Timepp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//现在几点
        int a = scan.nextInt();
//        现在几分
        int b = scan.nextInt();
//        几分钟后
        int t = scan.nextInt();
        b = b + t;
        if (b >= 60) {
            a += b / 60;
            b = b % 60;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
