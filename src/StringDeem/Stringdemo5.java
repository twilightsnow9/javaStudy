package StringDeem;

import java.util.Scanner;

public class Stringdemo5 {
    public static void main(String[] args) {
//        遍历字符串
        Scanner scanner = new Scanner(System.in);
//        请输入一个字符串
        System.out.println("请输入一个字符串");
        String sc = scanner.next();

//        遍历字符串
        for (int i = 0; i < sc.length(); i++) {
//            拿到每个字符
            char c = sc.charAt(i);
            System.out.println(c);
        }
//        System.out.println(sc);
    }

}
