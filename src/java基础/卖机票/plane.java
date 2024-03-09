package java基础.卖机票;

import java.util.Scanner;

public class plane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====请输入机票原价=====");
        int Oprice = sc.nextInt();
        System.out.println("====请输入月份=====");
        int month = sc.nextInt();
        System.out.println("请选择头等舱(A)或者经济舱(B)");
        String mod = sc.next();
        if (month >= 5 && month <= 10) {
            switch (mod) {
                case "A":
                    System.out.println("这是头等舱" + 0.9 * Oprice);
                    break;
                case "B":
                    System.out.println("这是经济舱" + 0.85 * Oprice);
                    break;
            }
        } else {
            switch (mod) {
                case "A":
                    System.out.println("这是头等舱" + 0.7 * Oprice);
                    break;
                case "B":
                    System.out.println("这是经济舱" + 0.65 * Oprice);
                    break;
            }
        }
    }
}
