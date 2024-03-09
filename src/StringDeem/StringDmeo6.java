package StringDeem;

import java.util.Scanner;

public class StringDmeo6 {
    public static void main(String[] args) {
//        统计字符串
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        int m = 0;
        int n = 0;
        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            if (a > 64 && a < 97) {
                m++;
            } else {
                n++;
            }
        }

        System.out.println("大写字母有" + m + "个");
        System.out.println("小写字母有" + n + "个");
    }
}
