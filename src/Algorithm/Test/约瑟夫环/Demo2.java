package Algorithm.Test.约瑟夫环;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        // 人数
        int n = sc.nextInt();
        // 报数到m的人出列
        int m = sc.nextInt();
        List<Integer> people = new ArrayList<>();
        // 初始化人员列表
        for (int i = 0; i < n; i++) {
            people.add(i + 1);
        }

        int survivorIndex = josephus(n,m) + 1;// 最后幸存者的位置
        System.out.println("最后幸存者的位置是:" + survivorIndex);
    }

    public static int josephus(int n,int m) {
        if (n == 1) {
            return 0;
        } else {
//            System.out.println(m);
            return (josephus(n - 1, m) + m) % n;
        }
    }
}
