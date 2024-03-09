package lqb;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int X = 0;
        int Y = 0;
        int Z = 0;
        Scanner sc = new Scanner(System.in);
//        请输入可能会发生的事件个数
        System.out.println("请输入可能会发生的事件个数");
        int n = sc.nextInt();
        int[][] arr = new int[3][n];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            } 
        }

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }

    }
}
