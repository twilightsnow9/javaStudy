package StringDeem;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
//        键盘录入abc
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();

        String s2 = new String("abc");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
