package lqb;

import java.util.ArrayList;
import java.util.Scanner;

public class Yanhui {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int N = scan.nextInt();
//        定义一个二维数组
        int[][] arr = new int[N][N];
        ArrayList<Long> list = new ArrayList<>();
//        写一个杨辉三角
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                }
                if (j > 0 && i > 0) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                list.add((long)(arr[i][j]));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == N) {
                System.out.println(i + 1);
                break;
            }
        }
        scan.close();
    }
}
