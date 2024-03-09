package lqb;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择学生人数");
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请选择" + (i + 1) +"号学生的得分");
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }


        int sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avg = (double)sum / arr.length;
        }
        String[] newArr = new String[3];
        newArr[0] = "" + max;
        newArr[1] = "" + min;
        newArr[2] = String.format("%.2f", avg);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }
}
