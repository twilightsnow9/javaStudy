package Algorithm.Test.八皇后;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    static int l = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
//        标记冲突
//        标记列冲突
        boolean[] ca = new boolean[N];
//        标记左斜线
        boolean[] cb = new boolean[2 * N - 1];
//        标记右斜线
        boolean[] cc = new boolean[2 * N - 1];
        queen(arr,0,N,ca,cb,cc);
    }
    //一个8*8的二维数组
//    前后的点不能出现横竖斜连起来
    public static void queen(int[][] arr,int i,int N,boolean[] ca,boolean[] cb,boolean[] cc) {
//        0 为可以没有走, 1 为走通  3 为走过未走通
        if (i == N) { //找到出口
            l++;
            System.out.println(l);
            return;
        }
        for (int j = 0; j < N; j++) {
            if (ca[j] || cb[i + j] || cc[N - 1 -(i - j)]) {
                continue;
            }
            arr[i][j] = 1;
            ca[j] = cb[i + j] = cc[N - 1 - (i - j)] = true;
            queen(arr,i + 1, N ,ca,cb,cc);
            arr[i][j] = 0;
            ca[j] = cb[i + j] = cc[N - 1 - (i - j)] = false;

        }
    }
}
