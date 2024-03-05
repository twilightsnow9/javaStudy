package 评分打分;

import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + i + "位评委的打分");
            double a = sc.nextInt();
            arr[i] = a;
        }
main();
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        double min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

    }
}
