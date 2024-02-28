package ScannerDemo;

import java.util.Scanner;

public class scannerDemo1 {
    public static void main(String[] args) {
//        键盘录入并求和
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = scanner.nextInt();
        System.out.println(num1 + "和" + num2 + "的和为" + (num1 + num2));
    }
}
