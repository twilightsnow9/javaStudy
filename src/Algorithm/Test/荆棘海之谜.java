package Algorithm.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class 荆棘海之谜 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(shu(S,list.get(i)));
        }
    }

    public static int shu(String S,String listi) {
        int l = 0;
//        获取单个字符串的长度
        listi.length();
        for (int i = 0; i < S.length(); i++) {
            String a = "";
            String b = "";
            if (i + listi.length() < S.length()) {
                a = S.substring(i,i + listi.length());
            } else {
                b = S.substring(S.length() - listi.length(),S.length());
            }
            if (a.equals(listi)) {
                l++;
            } else if (b.equals(listi)) {
                l++;
                break;
            }
        }
        return l;
    }

}
