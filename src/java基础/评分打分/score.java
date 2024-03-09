package java基础.评分打分;

import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "位评委的打分");
            double a = sc.nextInt();
                arr[i] = a;
        }
//          求最大值
        double max = 0;
        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
        }

//          求最小值
        double min = 0;
        for (int j = 0; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
            }
        }

//        java基础.求和 - 最大 - 最小
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int avg = (int)(sum - max - min) / (arr.length - 2);

        System.out.println("最后得分" + avg);

    }
}
