package lqb;

public class HomeWork {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int)((Math.random() * 100) + 1);
        }
//        最大值
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
//        倒序打印
        int[] newArr = new int[arr.length];
        int m = 0;
        //        平均值
        int sum = 0;
        int avg = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[m] = arr[i];
            sum += arr[i];
            m++;
        }
        avg = sum / arr.length;

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == 8) {
                System.out.println("循环之中有8");
            }
            if (newArr[i] == max) {
                System.out.println("最大值"+ max + "这个数字的下标是" + i);
            }
        }
        System.out.println("平均值" + avg);
    }
}
