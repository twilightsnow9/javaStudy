package java基础.StringDeem;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个金额");
        int i = sc.nextInt();
        System.out.println(HAN(i));
    }

    public static String HAN(int m) {
        String han = "零壹贰叁肆伍陆柒捌玖";
        String l = String.valueOf(m);
        for (int i = 0; i < l.length(); i++) {

        }
        String Z = "";
        for (int i = 0; i < han.length(); i++) {
            Z += han.charAt(i);
        }
        return Z;
    }

}
