package java基础.ArrayDemo;

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr = {10,12,45,90};
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = a;

        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if (newArr[i] < newArr[j]) {
                    int temp = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = temp;
                }
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
        }

    }
}
