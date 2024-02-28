package ScannerDemo;

import java.util.Scanner;

public class sc {
    public static void main(String[] args) {
//        创建对象
        Scanner scanner = new Scanner(System.in);
//        接收键盘录入的值
        int i =  scanner.nextInt();
        System.out.println("请输入一个整数：" + i);

    }
}
