package java基础.对称字符串;

import java.util.Scanner;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        StringBuilder m = new StringBuilder();
        for (int i = s.length() / 2; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            sb.append(s.charAt(i));
        }
        String a = sb.reverse().toString();
        for (int i = 0; i < s.length() / 2; i++) {
            System.out.println(s.charAt(i));
            m.append(s.charAt(i));
        }
        String l = m.toString();
        if (a.equals(l)) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }
    }
}
