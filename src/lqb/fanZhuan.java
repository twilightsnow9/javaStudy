package lqb;

import java.util.Scanner;

public class fanZhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        输入包含多组数据
        System.out.println("===========多组数据============");
        int D = sc.nextInt();
        int count = 0;
        String S = "";
        String T = "";
        for (int j = 0; j < 2D; j++) {
            String S1 = sc.next();
            String T1 = sc.next();
            S += S1;
            T += T1;
        }
        char[] t = T.toCharArray();
        System.out.println(T);
        for (int i = 1; i < t.length; i++) {
//            if (S.equals(T)) {
//                System.out.println(count);
//            };
            if (t[i - 1] == t[i + 1]) {
                t[i] = t[i + 1];
                i += 2;
                count++;
//                continue;
            }
        }
//        System.out.println(S);
    }
}
