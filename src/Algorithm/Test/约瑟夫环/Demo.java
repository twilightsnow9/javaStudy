package Algorithm.Test.约瑟夫环;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int k = sc.nextInt();
        System.out.println(fn(list,k,0));
    }
    public static int fn(ArrayList<Integer> list,int k,int n) {
        if (list.size() == 1) {
            return list.get(0);
        } else {
            if (list.size() < k + n) {
                int a = (k + n) % list.size();
                if (a > 0) {
                    list.remove(a - 1);
                    //n是索引
                    n = a - 1;
                } else {
                    list.remove(list.size() -1);
                    n = 0;
                    System.out.println(list.get(n));
                }
//                } else {
//                    list.remove(a);
//                    n = a + 1;
//                }
                fn(list,k,n);
                return list.get(0);
            } else {
                list.remove((k - 1) + n);
                n = (k - 1) + n;
                if (n == list.size()) {
                    n = 0;
                }
                fn(list,k,n);
            }
        }
         return list.get(0);
    }
}
